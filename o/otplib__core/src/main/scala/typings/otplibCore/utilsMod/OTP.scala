package typings.otplibCore.utilsMod

import typings.std.Partial
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@otplib/core/utils", "OTP")
@js.native
/**
  * Constructs the class with defaultOptions set.
  *
  * @param defaultOptions used to override or add existing defaultOptions.
  */
class OTP[T /* <: OTPOptions */] () extends js.Object {
  def this(defaultOptions: Partial[T]) = this()
  
  /**
    * Default options for an instance.
    *
    * These options **WILL PERSIST** even when [[resetOptions]] is called.
    */
  var _defaultOptions: Partial[T] = js.native
  
  /**
    * Transient options for an instance.
    *
    * Values set here will take precedence over the same options that
    * are set in [[_defaultOptions]].
    *
    * These options **WILL NOT PERSIST** upon calling [[resetOptions]].
    */
  var _options: Partial[T] = js.native
  
  /**
    * Returns class options polyfilled with some of
    * the missing required options.
    *
    * Reference: [[hotpOptions]]
    */
  def allOptions(): T = js.native
  
  def clone(defaultOptions: Partial[T]): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: this['create'] */ js.Any
  ] = js.native
  
  /**
    * Creates a new instance with all defaultOptions and options reset.
    */
  def create(): OTP[T] = js.native
  def create(defaultOptions: Partial[T]): OTP[T] = js.native
  
  /**
    * - The options **getter** will return all [[_options]],
    * including those set into [[_defaultOptions]].
    */
  def options: Partial[T] = js.native
  /**
    * - The options **setter** sets values into [[_options]].
    */
  def options_=(options: Partial[T]): Unit = js.native
  
  /**
    * Resets the current options. Does not reset default options.
    *
    * Default options are those that are specified during class
    * inititialisation, when calling [[clone]] or when calling [[create]]
    */
  def resetOptions(): Unit = js.native
}
