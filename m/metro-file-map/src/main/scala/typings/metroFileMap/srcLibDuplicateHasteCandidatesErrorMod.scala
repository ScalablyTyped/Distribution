package typings.metroFileMap

import typings.metroFileMap.srcFlowTypesMod.DuplicatesSet
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibDuplicateHasteCandidatesErrorMod {
  
  @JSImport("metro-file-map/src/lib/DuplicateHasteCandidatesError", "DuplicateHasteCandidatesError")
  @js.native
  open class DuplicateHasteCandidatesError protected ()
    extends StObject
       with Error {
    def this(name: String, platform: String, supportsNativePlatform: Boolean, duplicatesSet: DuplicatesSet) = this()
    
    var duplicatesSet: DuplicatesSet = js.native
    
    var hasteName: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var platform: String | Null = js.native
    
    var supportsNativePlatform: Boolean = js.native
  }
}
