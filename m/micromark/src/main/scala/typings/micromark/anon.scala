package typings.micromark

import typings.micromark.sharedTypesMod.HtmlExtension
import typings.micromark.typesMod.Type
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Enter extends HtmlExtension {
    
    var enter: Record[Type, js.Function0[Unit]] = js.native
  }
  object Enter {
    
    @scala.inline
    def apply(enter: Record[Type, js.Function0[Unit]]): Enter = {
      val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enter]
    }
    
    @scala.inline
    implicit class EnterMutableBuilder[Self <: Enter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnter(value: Record[Type, js.Function0[Unit]]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EnterRecord
    extends typings.micromark.libSharedTypesMod.HtmlExtension {
    
    var enter: Record[typings.micromark.constantTypesMod.Type, js.Function0[Unit]] = js.native
  }
  object EnterRecord {
    
    @scala.inline
    def apply(enter: Record[typings.micromark.constantTypesMod.Type, js.Function0[Unit]]): EnterRecord = {
      val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnterRecord]
    }
    
    @scala.inline
    implicit class EnterRecordMutableBuilder[Self <: EnterRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnter(value: Record[typings.micromark.constantTypesMod.Type, js.Function0[Unit]]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Exit extends HtmlExtension {
    
    var exit: Record[Type, js.Function0[Unit]] = js.native
  }
  object Exit {
    
    @scala.inline
    def apply(exit: Record[Type, js.Function0[Unit]]): Exit = {
      val __obj = js.Dynamic.literal(exit = exit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exit]
    }
    
    @scala.inline
    implicit class ExitMutableBuilder[Self <: Exit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExit(value: Record[Type, js.Function0[Unit]]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExitRecord
    extends typings.micromark.libSharedTypesMod.HtmlExtension {
    
    var exit: Record[typings.micromark.constantTypesMod.Type, js.Function0[Unit]] = js.native
  }
  object ExitRecord {
    
    @scala.inline
    def apply(exit: Record[typings.micromark.constantTypesMod.Type, js.Function0[Unit]]): ExitRecord = {
      val __obj = js.Dynamic.literal(exit = exit.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExitRecord]
    }
    
    @scala.inline
    implicit class ExitRecordMutableBuilder[Self <: ExitRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExit(value: Record[typings.micromark.constantTypesMod.Type, js.Function0[Unit]]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    }
  }
}
