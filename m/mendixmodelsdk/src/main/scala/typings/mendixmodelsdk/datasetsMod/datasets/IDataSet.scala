package typings.mendixmodelsdk.datasetsMod.datasets

import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `DataSets`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/data-sets relevant section in reference guide}
  */
@js.native
trait IDataSet extends IDocument {
  val parameters: IList[IDataSetParameter] = js.native
}

