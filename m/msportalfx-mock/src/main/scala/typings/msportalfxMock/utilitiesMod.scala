package typings.msportalfxMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilitiesMod {
  
  object Utilities {
    
    @JSImport("msportalfx-mock/lib/src/Helpers/utilities", "Utilities")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Helper to clone an object.
      */
    inline def clone_(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * Helper to find an item in an array.
      */
    inline def findInArr[T](arr: js.Array[T], callbackFn: js.Function1[/* item */ T, Boolean]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("findInArr")(arr.asInstanceOf[js.Any], callbackFn.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Helper to iterate over all keys in an ovject.
      */
    inline def forEachKey[T](obj: Any, iterator: js.Function2[/* key */ Any, /* value */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachKey")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Returns a GUID such as xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx.
      *
      * @return New GUID.
      */
    inline def newGuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("newGuid")().asInstanceOf[String]
    inline def newGuid(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("newGuid")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
