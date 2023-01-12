package typings.pell

import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exec(command: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def exec(command: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def init[T /* <: HTMLElement */](c: pellConfig[T]): T & PellElement = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(c.asInstanceOf[js.Any]).asInstanceOf[T & PellElement]
  
  trait PellElement extends StObject {
    
    var content: HTMLDivElement
  }
  object PellElement {
    
    inline def apply(content: HTMLDivElement): PellElement = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PellElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PellElement] (val x: Self) extends AnyVal {
      
      inline def setContent(value: HTMLDivElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pell.mod.pellBuiltinAction
    - typings.pell.mod.pellActionConfig
    - typings.pell.mod.pellCustomActionConfig
  */
  trait pellAction extends StObject
  
  trait pellActionConfig
    extends StObject
       with pellAction {
    
    var icon: js.UndefOr[String] = js.undefined
    
    var name: pellAction
    
    def result(): Unit
    
    var title: js.UndefOr[String] = js.undefined
  }
  object pellActionConfig {
    
    inline def apply(name: pellAction, result: () => Unit): pellActionConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], result = js.Any.fromFunction0(result))
      __obj.asInstanceOf[pellActionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pellActionConfig] (val x: Self) extends AnyVal {
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setName(value: pellAction): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResult(value: () => Unit): Self = StObject.set(x, "result", js.Any.fromFunction0(value))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pell.pellStrings.bold
    - typings.pell.pellStrings.italic
    - typings.pell.pellStrings.underline
    - typings.pell.pellStrings.strikethrough
    - typings.pell.pellStrings.heading1
    - typings.pell.pellStrings.heading2
    - typings.pell.pellStrings.paragraph
    - typings.pell.pellStrings.quote
    - typings.pell.pellStrings.olist
    - typings.pell.pellStrings.ulist
    - typings.pell.pellStrings.code
    - typings.pell.pellStrings.line
    - typings.pell.pellStrings.link
    - typings.pell.pellStrings.image
  */
  trait pellBuiltinAction
    extends StObject
       with pellAction
  object pellBuiltinAction {
    
    inline def bold: typings.pell.pellStrings.bold = "bold".asInstanceOf[typings.pell.pellStrings.bold]
    
    inline def code: typings.pell.pellStrings.code = "code".asInstanceOf[typings.pell.pellStrings.code]
    
    inline def heading1: typings.pell.pellStrings.heading1 = "heading1".asInstanceOf[typings.pell.pellStrings.heading1]
    
    inline def heading2: typings.pell.pellStrings.heading2 = "heading2".asInstanceOf[typings.pell.pellStrings.heading2]
    
    inline def image: typings.pell.pellStrings.image = "image".asInstanceOf[typings.pell.pellStrings.image]
    
    inline def italic: typings.pell.pellStrings.italic = "italic".asInstanceOf[typings.pell.pellStrings.italic]
    
    inline def line: typings.pell.pellStrings.line = "line".asInstanceOf[typings.pell.pellStrings.line]
    
    inline def link: typings.pell.pellStrings.link = "link".asInstanceOf[typings.pell.pellStrings.link]
    
    inline def olist: typings.pell.pellStrings.olist = "olist".asInstanceOf[typings.pell.pellStrings.olist]
    
    inline def paragraph: typings.pell.pellStrings.paragraph = "paragraph".asInstanceOf[typings.pell.pellStrings.paragraph]
    
    inline def quote: typings.pell.pellStrings.quote = "quote".asInstanceOf[typings.pell.pellStrings.quote]
    
    inline def strikethrough: typings.pell.pellStrings.strikethrough = "strikethrough".asInstanceOf[typings.pell.pellStrings.strikethrough]
    
    inline def ulist: typings.pell.pellStrings.ulist = "ulist".asInstanceOf[typings.pell.pellStrings.ulist]
    
    inline def underline: typings.pell.pellStrings.underline = "underline".asInstanceOf[typings.pell.pellStrings.underline]
  }
  
  trait pellClasses extends StObject {
    
    var actionbar: js.UndefOr[String] = js.undefined
    
    var button: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[String] = js.undefined
  }
  object pellClasses {
    
    inline def apply(): pellClasses = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pellClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pellClasses] (val x: Self) extends AnyVal {
      
      inline def setActionbar(value: String): Self = StObject.set(x, "actionbar", value.asInstanceOf[js.Any])
      
      inline def setActionbarUndefined: Self = StObject.set(x, "actionbar", js.undefined)
      
      inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  trait pellConfig[T /* <: HTMLElement */] extends StObject {
    
    var actions: js.Array[pellAction]
    
    var classes: js.UndefOr[pellClasses] = js.undefined
    
    var defaultParagraphSeparator: js.UndefOr[String] = js.undefined
    
    var element: T
    
    def onChange(html: String): Unit
    
    var styleWithCSS: js.UndefOr[Boolean] = js.undefined
  }
  object pellConfig {
    
    inline def apply[T /* <: HTMLElement */](actions: js.Array[pellAction], element: T, onChange: String => Unit): pellConfig[T] = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[pellConfig[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pellConfig[?], T /* <: HTMLElement */] (val x: Self & pellConfig[T]) extends AnyVal {
      
      inline def setActions(value: js.Array[pellAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: pellAction*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setClasses(value: pellClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setDefaultParagraphSeparator(value: String): Self = StObject.set(x, "defaultParagraphSeparator", value.asInstanceOf[js.Any])
      
      inline def setDefaultParagraphSeparatorUndefined: Self = StObject.set(x, "defaultParagraphSeparator", js.undefined)
      
      inline def setElement(value: T): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setStyleWithCSS(value: Boolean): Self = StObject.set(x, "styleWithCSS", value.asInstanceOf[js.Any])
      
      inline def setStyleWithCSSUndefined: Self = StObject.set(x, "styleWithCSS", js.undefined)
    }
  }
  
  trait pellCustomActionConfig
    extends StObject
       with pellAction {
    
    var icon: String
    
    var name: js.UndefOr[String] = js.undefined
    
    def result(): Unit
    
    var title: js.UndefOr[String] = js.undefined
  }
  object pellCustomActionConfig {
    
    inline def apply(icon: String, result: () => Unit): pellCustomActionConfig = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], result = js.Any.fromFunction0(result))
      __obj.asInstanceOf[pellCustomActionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pellCustomActionConfig] (val x: Self) extends AnyVal {
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResult(value: () => Unit): Self = StObject.set(x, "result", js.Any.fromFunction0(value))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
