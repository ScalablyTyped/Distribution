package typings.meteor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.meteor.Sink because Already inherited */ @js.native
trait ServerSink
  extends StObject
     with ClientSink {
  
  var arch: String = js.native
  
  var body: String = js.native
  
  var head: String = js.native
  
  var htmlById: StringDictionary[String] = js.native
  
  var maybeMadeChanges: Boolean = js.native
  
  // Server-only:
  var request: Any = js.native
}
