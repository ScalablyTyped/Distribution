package typings.mfiles

import typings.mfiles.MFilesNs.MFBuiltInDocumentClass
import typings.mfiles.MFilesNs.MFBuiltInObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkflow extends js.Object {
  var ID: Double
  var Name: String
  var ObjectClass: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double
  def Clone(): IWorkflow
  def GetAsLookup(): ILookup
  def GetAsTypedValue(): ITypedValue
}

object IWorkflow {
  @scala.inline
  def apply(
    Clone: () => IWorkflow,
    GetAsLookup: () => ILookup,
    GetAsTypedValue: () => ITypedValue,
    ID: Double,
    Name: String,
    ObjectClass: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double
  ): IWorkflow = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetAsLookup = js.Any.fromFunction0(GetAsLookup), GetAsTypedValue = js.Any.fromFunction0(GetAsTypedValue), ID = ID, Name = Name, ObjectClass = ObjectClass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWorkflow]
  }
}

