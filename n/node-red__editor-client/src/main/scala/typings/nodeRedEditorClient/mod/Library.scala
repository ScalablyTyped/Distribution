package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Container
import typings.nodeRedEditorClient.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Library extends js.Object {
  
  def create(options: typings.nodeRedEditorClient.anon.Editor): Unit = js.native
  
  def createBrowser(options: Container): Data = js.native
  
  def init(): Unit = js.native
  
  def loadLibraryFolder(
    library: String,
    `type`: String,
    root: String,
    done: js.Function1[/* items */ js.Array[js.Object], Unit]
  ): Unit = js.native
}
object Library {
  
  @scala.inline
  def apply(
    create: typings.nodeRedEditorClient.anon.Editor => Unit,
    createBrowser: Container => Data,
    init: () => Unit,
    loadLibraryFolder: (String, String, String, js.Function1[/* items */ js.Array[js.Object], Unit]) => Unit
  ): Library = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createBrowser = js.Any.fromFunction1(createBrowser), init = js.Any.fromFunction0(init), loadLibraryFolder = js.Any.fromFunction4(loadLibraryFolder))
    __obj.asInstanceOf[Library]
  }
  
  @scala.inline
  implicit class LibraryOps[Self <: Library] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: typings.nodeRedEditorClient.anon.Editor => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateBrowser(value: Container => Data): Self = this.set("createBrowser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadLibraryFolder(value: (String, String, String, js.Function1[/* items */ js.Array[js.Object], Unit]) => Unit): Self = this.set("loadLibraryFolder", js.Any.fromFunction4(value))
  }
}
