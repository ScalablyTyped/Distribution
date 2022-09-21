package typings.ngPackagr.anon

import typings.chokidar.mod.FSWatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnFileChange extends StObject {
  
  var onFileChange: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<FileChangedEvent> */ Any
  
  var watcher: FSWatcher
}
object OnFileChange {
  
  inline def apply(
    onFileChange: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<FileChangedEvent> */ Any,
    watcher: FSWatcher
  ): OnFileChange = {
    val __obj = js.Dynamic.literal(onFileChange = onFileChange.asInstanceOf[js.Any], watcher = watcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFileChange]
  }
  
  extension [Self <: OnFileChange](x: Self) {
    
    inline def setOnFileChange(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<FileChangedEvent> */ Any
    ): Self = StObject.set(x, "onFileChange", value.asInstanceOf[js.Any])
    
    inline def setWatcher(value: FSWatcher): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
  }
}
