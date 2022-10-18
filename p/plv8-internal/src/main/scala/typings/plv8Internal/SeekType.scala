package typings.plv8Internal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SeekType extends StObject
@JSGlobal("SeekType")
@js.native
object SeekType extends StObject {
  
  @js.native
  sealed trait WINDOW_SEEK_CURRENT
    extends StObject
       with SeekType
  
  @js.native
  sealed trait WINDOW_SEEK_HEAD
    extends StObject
       with SeekType
  
  @js.native
  sealed trait WINDOW_SEEK_TAIL
    extends StObject
       with SeekType
}
