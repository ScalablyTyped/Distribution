package typings.minimistOptions

import typings.minimistOptions.mod.OptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object minimistOptionsStrings {
  @js.native
  sealed trait array extends OptionType
  
  @js.native
  sealed trait boolean extends OptionType
  
  @js.native
  sealed trait `boolean-array` extends OptionType
  
  @js.native
  sealed trait number extends OptionType
  
  @js.native
  sealed trait `number-array` extends OptionType
  
  @js.native
  sealed trait string extends OptionType
  
  @js.native
  sealed trait `string-array` extends OptionType
  
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def `boolean-array`: `boolean-array` = "boolean-array".asInstanceOf[`boolean-array`]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def `number-array`: `number-array` = "number-array".asInstanceOf[`number-array`]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def `string-array`: `string-array` = "string-array".asInstanceOf[`string-array`]
}

