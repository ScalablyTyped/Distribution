package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldGroupMod {
  
  inline def apply(name: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(List(name.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/FieldGroup", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FieldGroup {
    def this(name: String, args: Any*) = this()
    
    /* CompleteClass */
    override def assign(obj: FieldGroup): Unit = js.native
    
    /* CompleteClass */
    var autoSanitize: Boolean = js.native
    
    /* CompleteClass */
    var collapsed: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var createId_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var css: Any = js.native
    
    /* private */ /* CompleteClass */
    var getStyleText: Any = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var label: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* private */ /* CompleteClass */
    var name_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var order: Any = js.native
    
    /* CompleteClass */
    var parent: String = js.native
    
    /* private */ /* CompleteClass */
    var parseStylePropertyName: Any = js.native
    
    /* private */ /* CompleteClass */
    var reservedWords: Any = js.native
    
    /* private */ /* CompleteClass */
    var setFieldsProperties: Any = js.native
    
    /* CompleteClass */
    override def stringify(): String = js.native
    
    /* private */ /* CompleteClass */
    @JSName("toString")
    var toString_FFieldGroup: Any = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/FieldGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FieldGroup extends StObject {
    
    def assign(obj: FieldGroup): Unit
    
    var autoSanitize: Boolean
    
    var collapsed: Boolean
    
    /* private */ var createId_ : Any
    
    /* private */ var css: Any
    
    /* private */ var getStyleText: Any
    
    var id: Double
    
    var label: String
    
    var name: String
    
    /* private */ var name_ : Any
    
    /* private */ var order: Any
    
    var parent: String
    
    /* private */ var parseStylePropertyName: Any
    
    /* private */ var reservedWords: Any
    
    /* private */ var setFieldsProperties: Any
    
    def stringify(): String
    
    /* private */ @JSName("toString")
    var toString_FFieldGroup: Any
  }
  object FieldGroup {
    
    inline def apply(
      assign: FieldGroup => Unit,
      autoSanitize: Boolean,
      collapsed: Boolean,
      createId_ : Any,
      css: Any,
      getStyleText: Any,
      id: Double,
      label: String,
      name: String,
      name_ : Any,
      order: Any,
      parent: String,
      parseStylePropertyName: Any,
      reservedWords: Any,
      setFieldsProperties: Any,
      stringify: () => String,
      toString_ : Any
    ): FieldGroup = {
      val __obj = js.Dynamic.literal(assign = js.Any.fromFunction1(assign), autoSanitize = autoSanitize.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], createId_ = createId_.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], getStyleText = getStyleText.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_ = name_.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parseStylePropertyName = parseStylePropertyName.asInstanceOf[js.Any], reservedWords = reservedWords.asInstanceOf[js.Any], setFieldsProperties = setFieldsProperties.asInstanceOf[js.Any], stringify = js.Any.fromFunction0(stringify))
      __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldGroup]
    }
    
    extension [Self <: FieldGroup](x: Self) {
      
      inline def setAssign(value: FieldGroup => Unit): Self = StObject.set(x, "assign", js.Any.fromFunction1(value))
      
      inline def setAutoSanitize(value: Boolean): Self = StObject.set(x, "autoSanitize", value.asInstanceOf[js.Any])
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCreateId_(value: Any): Self = StObject.set(x, "createId_", value.asInstanceOf[js.Any])
      
      inline def setCss(value: Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setGetStyleText(value: Any): Self = StObject.set(x, "getStyleText", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setName_(value: Any): Self = StObject.set(x, "name_", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Any): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParseStylePropertyName(value: Any): Self = StObject.set(x, "parseStylePropertyName", value.asInstanceOf[js.Any])
      
      inline def setReservedWords(value: Any): Self = StObject.set(x, "reservedWords", value.asInstanceOf[js.Any])
      
      inline def setSetFieldsProperties(value: Any): Self = StObject.set(x, "setFieldsProperties", value.asInstanceOf[js.Any])
      
      inline def setStringify(value: () => String): Self = StObject.set(x, "stringify", js.Any.fromFunction0(value))
      
      inline def setToString_(value: Any): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
    }
  }
}
