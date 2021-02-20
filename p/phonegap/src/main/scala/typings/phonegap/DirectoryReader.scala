package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryReader extends StObject {
  
  def readEntries(
    successCallback: js.Function1[/* entries */ FileSystemEntry, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
}
object DirectoryReader {
  
  @scala.inline
  def apply(
    readEntries: (js.Function1[/* entries */ FileSystemEntry, Unit], js.Function1[/* error */ FileError, Unit]) => Unit
  ): DirectoryReader = {
    val __obj = js.Dynamic.literal(readEntries = js.Any.fromFunction2(readEntries))
    __obj.asInstanceOf[DirectoryReader]
  }
  
  @scala.inline
  implicit class DirectoryReaderMutableBuilder[Self <: DirectoryReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadEntries(
      value: (js.Function1[/* entries */ FileSystemEntry, Unit], js.Function1[/* error */ FileError, Unit]) => Unit
    ): Self = StObject.set(x, "readEntries", js.Any.fromFunction2(value))
  }
}
