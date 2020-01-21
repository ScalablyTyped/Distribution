package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mendixmodelsdk.mendixmodelsdkStrings.bidi
  - typings.mendixmodelsdk.mendixmodelsdkStrings.conversion
  - typings.mendixmodelsdk.mendixmodelsdkStrings.edit
  - typings.mendixmodelsdk.mendixmodelsdkStrings.commit
  - typings.mendixmodelsdk.mendixmodelsdkStrings.update
  - typings.mendixmodelsdk.mendixmodelsdkStrings.switch
*/
trait LockType extends js.Object

object LockType {
  @scala.inline
  def bidi: typings.mendixmodelsdk.mendixmodelsdkStrings.bidi = this.cast("bidi")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def commit: typings.mendixmodelsdk.mendixmodelsdkStrings.commit = this.cast("commit")
  @scala.inline
  def conversion: typings.mendixmodelsdk.mendixmodelsdkStrings.conversion = this.cast("conversion")
  @scala.inline
  def edit: typings.mendixmodelsdk.mendixmodelsdkStrings.edit = this.cast("edit")
  @scala.inline
  def switch: typings.mendixmodelsdk.mendixmodelsdkStrings.switch = this.cast("switch")
  @scala.inline
  def update: typings.mendixmodelsdk.mendixmodelsdkStrings.update = this.cast("update")
}

