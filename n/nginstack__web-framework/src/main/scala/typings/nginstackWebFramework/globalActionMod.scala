package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalActionMod {
  
  inline def apply(name: String): Unit = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/GlobalAction", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GlobalAction {
    def this(name: String) = this()
    
    /* CompleteClass */
    var activity: String | Null = js.native
    
    /* CompleteClass */
    override def addParameter(param: Name): Unit = js.native
    
    /* CompleteClass */
    var caption: String = js.native
    
    /* CompleteClass */
    var defaultKeyParamName: String = js.native
    
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /* CompleteClass */
    override def getParameter(paramName: String): Name = js.native
    
    /* CompleteClass */
    override def getParameters(): Any = js.native
    
    /* CompleteClass */
    var help: String = js.native
    
    /* CompleteClass */
    var hint: String = js.native
    
    /* CompleteClass */
    var interaction: String | Null = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* private */ /* CompleteClass */
    var name_ : Any = js.native
    
    /* CompleteClass */
    var onShow: typings.nginstackEngine.legacyEventMod.^ = js.native
    
    /* CompleteClass */
    var params: Any = js.native
    
    /* CompleteClass */
    var targetKey: Double | Null = js.native
    
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  @JSImport("@nginstack/web-framework/lib/classdef/GlobalAction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GlobalAction extends StObject {
    
    var activity: String | Null
    
    def addParameter(param: Name): Unit
    
    var caption: String
    
    var defaultKeyParamName: String
    
    var enabled: Boolean
    
    def getParameter(paramName: String): Name
    
    def getParameters(): Any
    
    var help: String
    
    var hint: String
    
    var interaction: String | Null
    
    var name: String
    
    /* private */ var name_ : Any
    
    var onShow: typings.nginstackEngine.legacyEventMod.^
    
    var params: Any
    
    var targetKey: Double | Null
    
    var visible: Boolean
  }
  object GlobalAction {
    
    inline def apply(
      addParameter: Name => Unit,
      caption: String,
      defaultKeyParamName: String,
      enabled: Boolean,
      getParameter: String => Name,
      getParameters: () => Any,
      help: String,
      hint: String,
      name: String,
      name_ : Any,
      onShow: typings.nginstackEngine.legacyEventMod.^,
      params: Any,
      visible: Boolean
    ): GlobalAction = {
      val __obj = js.Dynamic.literal(addParameter = js.Any.fromFunction1(addParameter), caption = caption.asInstanceOf[js.Any], defaultKeyParamName = defaultKeyParamName.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], getParameter = js.Any.fromFunction1(getParameter), getParameters = js.Any.fromFunction0(getParameters), help = help.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_ = name_.asInstanceOf[js.Any], onShow = onShow.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], activity = null, interaction = null, targetKey = null)
      __obj.asInstanceOf[GlobalAction]
    }
    
    extension [Self <: GlobalAction](x: Self) {
      
      inline def setActivity(value: String): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setActivityNull: Self = StObject.set(x, "activity", null)
      
      inline def setAddParameter(value: Name => Unit): Self = StObject.set(x, "addParameter", js.Any.fromFunction1(value))
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setDefaultKeyParamName(value: String): Self = StObject.set(x, "defaultKeyParamName", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setGetParameter(value: String => Name): Self = StObject.set(x, "getParameter", js.Any.fromFunction1(value))
      
      inline def setGetParameters(value: () => Any): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setInteraction(value: String): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
      
      inline def setInteractionNull: Self = StObject.set(x, "interaction", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setName_(value: Any): Self = StObject.set(x, "name_", value.asInstanceOf[js.Any])
      
      inline def setOnShow(value: typings.nginstackEngine.legacyEventMod.^): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setTargetKey(value: Double): Self = StObject.set(x, "targetKey", value.asInstanceOf[js.Any])
      
      inline def setTargetKeyNull: Self = StObject.set(x, "targetKey", null)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
