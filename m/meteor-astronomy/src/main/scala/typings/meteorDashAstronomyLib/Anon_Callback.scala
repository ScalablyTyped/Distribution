package typings
package meteorDashAstronomyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback[T] extends js.Object {
  def copy(): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias meteor-astronomy.MeteorAstronomy.Model<T> */ js.Object = js.native
  def copy(save: scala.Boolean): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias meteor-astronomy.MeteorAstronomy.Model<T> */ js.Object = js.native
  def get(field: java.lang.String): js.Any = js.native
  def get(fields: js.Array[java.lang.String]): stdLib.Partial[T] = js.native
  def getModified(): js.Any = js.native
  def getModifiedValues(): stdLib.Partial[T] = js.native
  def getModifiedValues(options: Anon_Old): stdLib.Partial[T] = js.native
  def getModifier(): js.Any = js.native
  def isModified(): scala.Boolean = js.native
  def isModified(field: java.lang.String): scala.Boolean = js.native
  def raw(): T = js.native
  def raw(field: java.lang.String): js.Any = js.native
  def raw(fields: js.Array[java.lang.String]): stdLib.Partial[T] = js.native
  def remove(): scala.Unit = js.native
  def remove(callback: meteorDashAstronomyLib.MeteorAstronomyNs.RemoveCallback): scala.Unit = js.native
  def save(): scala.Unit = js.native
  def save(optionsOrCallback: meteorDashAstronomyLib.MeteorAstronomyNs.SaveAndValidateCallback): scala.Unit = js.native
  def save(
    optionsOrCallback: meteorDashAstronomyLib.MeteorAstronomyNs.SaveAndValidateOptions[java.lang.String]
  ): scala.Unit = js.native
  def save(
    options: meteorDashAstronomyLib.MeteorAstronomyNs.SaveAndValidateOptions[java.lang.String],
    callback: meteorDashAstronomyLib.MeteorAstronomyNs.SaveAndValidateCallback
  ): scala.Unit = js.native
  def set(field: java.lang.String, value: js.Any): scala.Unit = js.native
  def set(fields: stdLib.Partial[T]): scala.Unit = js.native
  def set(fields: stdLib.Partial[T], options: Anon_Cast): scala.Unit = js.native
  def validate(): scala.Unit = js.native
  def validate(optionsOrCallback: meteorDashAstronomyLib.MeteorAstronomyNs.SaveAndValidateCallback): scala.Unit = js.native
  def validate(
    optionsOrCallback: meteorDashAstronomyLib.MeteorAstronomyNs.SaveAndValidateOptions[java.lang.String]
  ): scala.Unit = js.native
  def validate(
    options: meteorDashAstronomyLib.MeteorAstronomyNs.SaveAndValidateOptions[java.lang.String],
    callback: meteorDashAstronomyLib.MeteorAstronomyNs.SaveAndValidateCallback
  ): scala.Unit = js.native
}

