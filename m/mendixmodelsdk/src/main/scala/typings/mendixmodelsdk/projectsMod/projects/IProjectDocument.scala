package typings.mendixmodelsdk.projectsMod.projects

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.unitsMod.IModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
  */
@js.native
trait IProjectDocument extends IModelUnit {
  val containerAsProject: IProject = js.native
  @JSName("model")
  val model_IProjectDocument: IModel = js.native
}

