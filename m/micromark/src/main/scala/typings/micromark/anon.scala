package typings.micromark

import typings.micromark.sharedTypesMod.HtmlExtension
import typings.micromark.typesMod.Type
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Enter
    extends StObject
       with HtmlExtension {
    
    var enter: Record[Type, js.Function0[Unit]]
  }
  object Enter {
    
    inline def apply(enter: Record[Type, js.Function0[Unit]]): Enter = {
      val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enter]
    }
    
    extension [Self <: Enter](x: Self) {
      
      inline def setEnter(value: Record[Type, js.Function0[Unit]]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnterRecord
    extends StObject
       with typings.micromark.libSharedTypesMod.HtmlExtension {
    
    var enter: Record[typings.micromark.constantTypesMod.Type, js.Function0[Unit]]
  }
  object EnterRecord {
    
    inline def apply(enter: Record[typings.micromark.constantTypesMod.Type, js.Function0[Unit]]): EnterRecord = {
      val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnterRecord]
    }
    
    extension [Self <: EnterRecord](x: Self) {
      
      inline def setEnter(value: Record[typings.micromark.constantTypesMod.Type, js.Function0[Unit]]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    }
  }
  
  trait Exit
    extends StObject
       with HtmlExtension {
    
    var exit: Record[Type, js.Function0[Unit]]
  }
  object Exit {
    
    inline def apply(exit: Record[Type, js.Function0[Unit]]): Exit = {
      val __obj = js.Dynamic.literal(exit = exit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exit]
    }
    
    extension [Self <: Exit](x: Self) {
      
      inline def setExit(value: Record[Type, js.Function0[Unit]]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExitRecord
    extends StObject
       with typings.micromark.libSharedTypesMod.HtmlExtension {
    
    var exit: Record[typings.micromark.constantTypesMod.Type, js.Function0[Unit]]
  }
  object ExitRecord {
    
    inline def apply(exit: Record[typings.micromark.constantTypesMod.Type, js.Function0[Unit]]): ExitRecord = {
      val __obj = js.Dynamic.literal(exit = exit.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExitRecord]
    }
    
    extension [Self <: ExitRecord](x: Self) {
      
      inline def setExit(value: Record[typings.micromark.constantTypesMod.Type, js.Function0[Unit]]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    }
  }
}
