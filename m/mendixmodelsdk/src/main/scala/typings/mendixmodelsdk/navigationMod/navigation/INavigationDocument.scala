package typings.mendixmodelsdk.navigationMod.navigation

import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.projectsMod.projects.IProjectDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/navigation relevant section in reference guide}
  */
@js.native
trait INavigationDocument extends IProjectDocument {
  
  /**
    * In version 7.2.0: introduced
    */
  val profiles: IList[INavigationProfileBase] = js.native
}
