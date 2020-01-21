package typings.mendixmodelsdk.structuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mendixmodelsdk.mendixmodelsdkStrings.`new`
  - typings.mendixmodelsdk.mendixmodelsdkStrings.attached
  - typings.mendixmodelsdk.mendixmodelsdkStrings.detached
  - typings.mendixmodelsdk.mendixmodelsdkStrings.deleted
*/
trait StructureState extends js.Object

object StructureState {
  @scala.inline
  def attached: typings.mendixmodelsdk.mendixmodelsdkStrings.attached = this.cast("attached")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deleted: typings.mendixmodelsdk.mendixmodelsdkStrings.deleted = this.cast("deleted")
  @scala.inline
  def detached: typings.mendixmodelsdk.mendixmodelsdkStrings.detached = this.cast("detached")
  @scala.inline
  def `new`: typings.mendixmodelsdk.mendixmodelsdkStrings.`new` = this.cast("new")
}

