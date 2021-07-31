package typings.mdastUtilFromMarkdown

import typings.mdast.mod.Root
import typings.micromark.sharedTypesMod.Buffer
import typings.micromark.sharedTypesMod.BufferEncoding
import typings.micromark.sharedTypesMod.SyntaxExtension
import typings.micromark.sharedTypesMod.Token
import typings.micromark.typesMod.Type
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(value: String): Root = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Root]
  @scala.inline
  def apply(value: String, encoding: Unit, options: Options): Root = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  @scala.inline
  def apply(value: String, encoding: BufferEncoding): Root = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Root]
  @scala.inline
  def apply(value: String, encoding: BufferEncoding, options: Options): Root = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  @scala.inline
  def apply(value: String, options: Options): Root = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  @scala.inline
  def apply(value: Buffer): Root = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Root]
  @scala.inline
  def apply(value: Buffer, encoding: Unit, options: Options): Root = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  @scala.inline
  def apply(value: Buffer, encoding: BufferEncoding): Root = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Root]
  @scala.inline
  def apply(value: Buffer, encoding: BufferEncoding, options: Options): Root = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  @scala.inline
  def apply(value: Buffer, options: Options): Root = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  
  @JSImport("mdast-util-from-markdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MdastExtension extends StObject {
    
    var enter: Record[Type, js.Function1[/* token */ Token, Unit]]
    
    var exit: Record[Type, js.Function1[/* token */ Token, Unit]]
  }
  object MdastExtension {
    
    @scala.inline
    def apply(
      enter: Record[Type, js.Function1[/* token */ Token, Unit]],
      exit: Record[Type, js.Function1[/* token */ Token, Unit]]
    ): MdastExtension = {
      val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
      __obj.asInstanceOf[MdastExtension]
    }
    
    @scala.inline
    implicit class MdastExtensionMutableBuilder[Self <: MdastExtension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnter(value: Record[Type, js.Function1[/* token */ Token, Unit]]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExit(value: Record[Type, js.Function1[/* token */ Token, Unit]]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var extensions: js.UndefOr[js.Array[SyntaxExtension]] = js.undefined
    
    var mdastExtensions: js.UndefOr[js.Array[MdastExtension]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtensions(value: js.Array[SyntaxExtension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: SyntaxExtension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setMdastExtensions(value: js.Array[MdastExtension]): Self = StObject.set(x, "mdastExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdastExtensionsUndefined: Self = StObject.set(x, "mdastExtensions", js.undefined)
      
      @scala.inline
      def setMdastExtensionsVarargs(value: MdastExtension*): Self = StObject.set(x, "mdastExtensions", js.Array(value :_*))
    }
  }
}
