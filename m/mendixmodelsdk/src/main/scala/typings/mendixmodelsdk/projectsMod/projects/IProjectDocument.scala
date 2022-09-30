package typings.mendixmodelsdk.projectsMod.projects

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.unitsMod.IModelUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/project relevant section in reference guide}
  */
@js.native
trait IProjectDocument
  extends StObject
     with IModelUnit {
  
  val containerAsProject: IProject = js.native
  
  @JSName("model")
  val model_IProjectDocument: IModel = js.native
}
