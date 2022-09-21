package typings.murmurhash3jsRevisited

import typings.murmurhash3jsRevisited.mod.X64_
import typings.murmurhash3jsRevisited.mod.X86_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object MurmurHash3 {
    
    object MurmurHash3 {
      
      @JSGlobal("MurmurHash3.MurmurHash3")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("MurmurHash3.MurmurHash3.x64")
      @js.native
      def x64: X64_ = js.native
      inline def x64_=(x: X64_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x64")(x.asInstanceOf[js.Any])
      
      @JSGlobal("MurmurHash3.MurmurHash3.x86")
      @js.native
      def x86: X86_ = js.native
      inline def x86_=(x: X86_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x86")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("MurmurHash3.x64")
    @js.native
    val x64: X64_ = js.native
    
    @JSGlobal("MurmurHash3.x86")
    @js.native
    val x86: X86_ = js.native
  }
}
