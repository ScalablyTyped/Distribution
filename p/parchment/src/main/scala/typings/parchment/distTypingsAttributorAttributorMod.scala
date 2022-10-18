package typings.parchment

import typings.parchment.distTypingsScopeMod.Scope
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsAttributorAttributorMod {
  
  @JSImport("parchment/dist/typings/attributor/attributor", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Attributor {
    def this(attrName: String, keyName: String) = this()
    def this(attrName: String, keyName: String, options: AttributorOptions) = this()
    
    /* CompleteClass */
    override def add(node: HTMLElement, value: String): Boolean = js.native
    
    /* CompleteClass */
    var attrName: String = js.native
    
    /* CompleteClass */
    override def canAdd(_node: HTMLElement, value: Any): Boolean = js.native
    
    /* CompleteClass */
    var keyName: String = js.native
    
    /* CompleteClass */
    override def remove(node: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    var scope: Scope = js.native
    
    /* CompleteClass */
    override def value(node: HTMLElement): String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("parchment/dist/typings/attributor/attributor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def keys(node: HTMLElement): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  trait Attributor extends StObject {
    
    def add(node: HTMLElement, value: String): Boolean
    
    var attrName: String
    
    def canAdd(_node: HTMLElement, value: Any): Boolean
    
    var keyName: String
    
    def remove(node: HTMLElement): Unit
    
    var scope: Scope
    
    def value(node: HTMLElement): String
    
    var whitelist: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Attributor {
    
    inline def apply(
      add: (HTMLElement, String) => Boolean,
      attrName: String,
      canAdd: (HTMLElement, Any) => Boolean,
      keyName: String,
      remove: HTMLElement => Unit,
      scope: Scope,
      value: HTMLElement => String
    ): Attributor = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), attrName = attrName.asInstanceOf[js.Any], canAdd = js.Any.fromFunction2(canAdd), keyName = keyName.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), scope = scope.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
      __obj.asInstanceOf[Attributor]
    }
    
    extension [Self <: Attributor](x: Self) {
      
      inline def setAdd(value: (HTMLElement, String) => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setAttrName(value: String): Self = StObject.set(x, "attrName", value.asInstanceOf[js.Any])
      
      inline def setCanAdd(value: (HTMLElement, Any) => Boolean): Self = StObject.set(x, "canAdd", js.Any.fromFunction2(value))
      
      inline def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: HTMLElement => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setValue(value: HTMLElement => String): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value*))
    }
  }
  
  trait AttributorOptions extends StObject {
    
    var scope: js.UndefOr[Scope] = js.undefined
    
    var whitelist: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AttributorOptions {
    
    inline def apply(): AttributorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributorOptions]
    }
    
    extension [Self <: AttributorOptions](x: Self) {
      
      inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value*))
    }
  }
}
