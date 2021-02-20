package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Projects extends StObject {
  
  def createDefaultFileSet(): Unit = js.native
  
  def createDefaultPackageFile(): Unit = js.native
  
  def editProject(): Unit = js.native
  
  def getActiveProject(): js.Object = js.native
  
  def init(): Unit = js.native
  
  def newProject(): Unit = js.native
  
  def refresh(): Unit = js.native
  def refresh(done: js.Function1[/* activeProject */ js.Object | Null, Unit]): Unit = js.native
  
  def selectProject(): Unit = js.native
  
  var settings: ProjectsSettings = js.native
  
  def showCredentialsPrompt(): Unit = js.native
  
  def showFilesPrompt(): Unit = js.native
  
  def showProjectDependencies(): Unit = js.native
  
  def showStartup(): Unit = js.native
  
  var userSettings: ProjectsUserSettings = js.native
}
