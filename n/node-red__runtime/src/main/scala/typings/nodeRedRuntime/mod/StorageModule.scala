package typings.nodeRedRuntime.mod

import typings.nodeRedRuntime.anon.CredentialsDirty
import typings.nodeRedRuntime.anon.CredentialsFlows
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageModule extends js.Object {
  
  def getFlows(): js.Promise[CredentialsFlows] = js.native
  
  def getLibraryEntry(`type`: String, path: String): js.Promise[String | js.Array[String]] = js.native
  
  def getSessions(): js.Promise[js.Object | Null] = js.native
  
  def getSettings(): js.Promise[js.Object | Null] = js.native
  
  def init(runtime: InternalRuntimeAPI): Unit = js.native
  
  def saveCredentials(credentials: js.Object): js.Promise[Unit] = js.native
  
  def saveFlows(config: CredentialsDirty): js.Promise[Unit] = js.native
  
  def saveLibraryEntry(`type`: String, path: String, meta: Record[String, String], body: String): js.Promise[Unit] = js.native
  
  def saveSessions(sessions: js.Object): js.Promise[Unit] = js.native
  
  def saveSettings(settings: js.Object): js.Promise[Unit] = js.native
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
  implicit class StorageModuleOps[Self <: StorageModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetFlows(value: () => js.Promise[CredentialsFlows]): Self = this.set("getFlows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLibraryEntry(value: (String, String) => js.Promise[String | js.Array[String]]): Self = this.set("getLibraryEntry", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSessions(value: () => js.Promise[js.Object | Null]): Self = this.set("getSessions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSettings(value: () => js.Promise[js.Object | Null]): Self = this.set("getSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: InternalRuntimeAPI => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveCredentials(value: js.Object => js.Promise[Unit]): Self = this.set("saveCredentials", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveFlows(value: CredentialsDirty => js.Promise[Unit]): Self = this.set("saveFlows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveLibraryEntry(value: (String, String, Record[String, String], String) => js.Promise[Unit]): Self = this.set("saveLibraryEntry", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSaveSessions(value: js.Object => js.Promise[Unit]): Self = this.set("saveSessions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveSettings(value: js.Object => js.Promise[Unit]): Self = this.set("saveSettings", js.Any.fromFunction1(value))
  }
}
