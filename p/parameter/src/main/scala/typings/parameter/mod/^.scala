package typings.parameter.mod

import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parameter", JSImport.Namespace)
@js.native
class ^ () extends Parameter {
  def this(options: ParameterOptions) = this()
}
@JSImport("parameter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var CONVERT_MAP: Record[String, js.UndefOr[ParameterConvertType]] = js.native
  
  def addRule[T /* <: String */](`type`: T, check: ParameterCheckFunction[T]): Unit = js.native
  /**
    * Add custom rules
    * @param type
    * @param check
    * @param override Override exist rules. Default: `true`
    * @param convertType Make parameter convert the input param to the specific type
    */
  def addRule[T /* <: String */](`type`: T, check: ParameterCheckFunction[T], convertType: ParameterConvertType): Unit = js.native
  def addRule[T /* <: String */](
    `type`: T,
    check: ParameterCheckFunction[T],
    `override`: js.UndefOr[scala.Nothing],
    convertType: ParameterConvertType
  ): Unit = js.native
  def addRule[T /* <: String */](`type`: T, check: ParameterCheckFunction[T], `override`: Boolean): Unit = js.native
  def addRule[T /* <: String */](
    `type`: T,
    check: ParameterCheckFunction[T],
    `override`: Boolean,
    convertType: ParameterConvertType
  ): Unit = js.native
  def addRule[T /* <: String */](`type`: T, check: RegExp): Unit = js.native
  def addRule[T /* <: String */](`type`: T, check: RegExp, convertType: ParameterConvertType): Unit = js.native
  def addRule[T /* <: String */](`type`: T, check: RegExp, `override`: js.UndefOr[scala.Nothing], convertType: ParameterConvertType): Unit = js.native
  def addRule[T /* <: String */](`type`: T, check: RegExp, `override`: Boolean): Unit = js.native
  def addRule[T /* <: String */](`type`: T, check: RegExp, `override`: Boolean, convertType: ParameterConvertType): Unit = js.native
}
