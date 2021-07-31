package typings.nodeRedRuntime.mod

import typings.nodeRedRuntime.anon.CredentialsDirty
import typings.nodeRedRuntime.anon.CredentialsFlows
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageModule extends StObject {
  
  def getFlows(): js.Promise[CredentialsFlows]
  
  def getLibraryEntry(`type`: String, path: String): js.Promise[String | js.Array[String]]
  
  def getSessions(): js.Promise[js.Object | Null]
  
  def getSettings(): js.Promise[js.Object | Null]
  
  def init(runtime: InternalRuntimeAPI): Unit
  
  def saveCredentials(credentials: js.Object): js.Promise[Unit]
  
  def saveFlows(config: CredentialsDirty): js.Promise[Unit]
  
  def saveLibraryEntry(`type`: String, path: String, meta: Record[String, String], body: String): js.Promise[Unit]
  
  def saveSessions(sessions: js.Object): js.Promise[Unit]
  
  def saveSettings(settings: js.Object): js.Promise[Unit]
}
object StorageModule {
  
  @scala.inline
  def apply(
    getFlows: () => js.Promise[CredentialsFlows],
    getLibraryEntry: (String, String) => js.Promise[String | js.Array[String]],
    getSessions: () => js.Promise[js.Object | Null],
    getSettings: () => js.Promise[js.Object | Null],
    init: InternalRuntimeAPI => Unit,
    saveCredentials: js.Object => js.Promise[Unit],
    saveFlows: CredentialsDirty => js.Promise[Unit],
    saveLibraryEntry: (String, String, Record[String, String], String) => js.Promise[Unit],
    saveSessions: js.Object => js.Promise[Unit],
    saveSettings: js.Object => js.Promise[Unit]
  ): StorageModule = {
    val __obj = js.Dynamic.literal(getFlows = js.Any.fromFunction0(getFlows), getLibraryEntry = js.Any.fromFunction2(getLibraryEntry), getSessions = js.Any.fromFunction0(getSessions), getSettings = js.Any.fromFunction0(getSettings), init = js.Any.fromFunction1(init), saveCredentials = js.Any.fromFunction1(saveCredentials), saveFlows = js.Any.fromFunction1(saveFlows), saveLibraryEntry = js.Any.fromFunction4(saveLibraryEntry), saveSessions = js.Any.fromFunction1(saveSessions), saveSettings = js.Any.fromFunction1(saveSettings))
    __obj.asInstanceOf[StorageModule]
  }
  
  @scala.inline
  implicit class StorageModuleMutableBuilder[Self <: StorageModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFlows(value: () => js.Promise[CredentialsFlows]): Self = StObject.set(x, "getFlows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLibraryEntry(value: (String, String) => js.Promise[String | js.Array[String]]): Self = StObject.set(x, "getLibraryEntry", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSessions(value: () => js.Promise[js.Object | Null]): Self = StObject.set(x, "getSessions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSettings(value: () => js.Promise[js.Object | Null]): Self = StObject.set(x, "getSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: InternalRuntimeAPI => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveCredentials(value: js.Object => js.Promise[Unit]): Self = StObject.set(x, "saveCredentials", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveFlows(value: CredentialsDirty => js.Promise[Unit]): Self = StObject.set(x, "saveFlows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveLibraryEntry(value: (String, String, Record[String, String], String) => js.Promise[Unit]): Self = StObject.set(x, "saveLibraryEntry", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSaveSessions(value: js.Object => js.Promise[Unit]): Self = StObject.set(x, "saveSessions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveSettings(value: js.Object => js.Promise[Unit]): Self = StObject.set(x, "saveSettings", js.Any.fromFunction1(value))
  }
}
