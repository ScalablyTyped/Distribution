package typings.nodeRedRuntime.mod

import typings.nodeRedRuntime.anon.Body
import typings.nodeRedRuntime.anon.Library
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LibraryModule extends js.Object {
  
  /**
    * Gets an entry from the library.
    * @param opts
    * @param opts.library - the library
    * @param opts.type - the type of entry
    * @param opts.path - the path of the entry
    * @param opts.req - the request to log (optional)
    */
  def getEntry(opts: Library): js.Promise[String | js.Object] = js.native
  
  /**
    * Saves an entry to the library
    * @param opts
    * @param opts.library - the library
    * @param opts.type - the type of entry
    * @param opts.path - the path of the entry
    * @param opts.meta - any meta data associated with the entry
    * @param opts.body - the body of the entry
    * @param opts.req - the request to log (optional)
    */
  def saveEntry(opts: Body): js.Promise[Unit] = js.native
}
object LibraryModule {
  
  @scala.inline
  def apply(getEntry: Library => js.Promise[String | js.Object], saveEntry: Body => js.Promise[Unit]): LibraryModule = {
    val __obj = js.Dynamic.literal(getEntry = js.Any.fromFunction1(getEntry), saveEntry = js.Any.fromFunction1(saveEntry))
    __obj.asInstanceOf[LibraryModule]
  }
  
  @scala.inline
  implicit class LibraryModuleOps[Self <: LibraryModule] (val x: Self) extends AnyVal {
    
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
    def setGetEntry(value: Library => js.Promise[String | js.Object]): Self = this.set("getEntry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveEntry(value: Body => js.Promise[Unit]): Self = this.set("saveEntry", js.Any.fromFunction1(value))
  }
}
