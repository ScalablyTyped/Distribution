package typings.mendixmodelsdk.navigationMod.navigation

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INavigationProfileBase
  extends IElement
     with IByNameReferrable {
  
  val containerAsNavigationDocument: INavigationDocument = js.native
  
  @JSName("model")
  val model_INavigationProfileBase: IModel = js.native
  
  /**
    * In version 7.2.0: introduced
    */
  val name: String = js.native
}
