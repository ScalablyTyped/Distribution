package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenDatatypesMod.datatypes.IDataType
import typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMicroflowBase extends IDocument {
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.9.0: introduced
    */
  val microflowReturnType: IDataType = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  val returnType: String | Null = js.native
}

