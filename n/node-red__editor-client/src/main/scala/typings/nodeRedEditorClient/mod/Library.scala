package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Container
import typings.nodeRedEditorClient.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Library extends StObject {
  
  def create(options: typings.nodeRedEditorClient.anon.Editor): Unit
  
  def createBrowser(options: Container): Data
  
  def init(): Unit
  
  def loadLibraryFolder(
    library: String,
    `type`: String,
    root: String,
    done: js.Function1[/* items */ js.Array[js.Object], Unit]
  ): Unit
}
object Library {
  
  inline def apply(
    create: typings.nodeRedEditorClient.anon.Editor => Unit,
    createBrowser: Container => Data,
    init: () => Unit,
    loadLibraryFolder: (String, String, String, js.Function1[/* items */ js.Array[js.Object], Unit]) => Unit
  ): Library = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createBrowser = js.Any.fromFunction1(createBrowser), init = js.Any.fromFunction0(init), loadLibraryFolder = js.Any.fromFunction4(loadLibraryFolder))
    __obj.asInstanceOf[Library]
  }
  
  extension [Self <: Library](x: Self) {
    
    inline def setCreate(value: typings.nodeRedEditorClient.anon.Editor => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setCreateBrowser(value: Container => Data): Self = StObject.set(x, "createBrowser", js.Any.fromFunction1(value))
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setLoadLibraryFolder(value: (String, String, String, js.Function1[/* items */ js.Array[js.Object], Unit]) => Unit): Self = StObject.set(x, "loadLibraryFolder", js.Any.fromFunction4(value))
  }
}
