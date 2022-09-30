package typings.mendixmodelsdk.projectsMod.projects

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.unitsMod.IModelUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Projects`.
  */
@js.native
trait IModuleDocument
  extends StObject
     with IModelUnit {
  
  val containerAsFolderBase: IFolderBase = js.native
  
  val containerAsModule: IModule = js.native
  
  @JSName("model")
  val model_IModuleDocument: IModel = js.native
}
