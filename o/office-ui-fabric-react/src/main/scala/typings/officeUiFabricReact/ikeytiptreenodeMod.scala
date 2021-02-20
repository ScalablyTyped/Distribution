package typings.officeUiFabricReact

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ikeytiptreenodeMod {
  
  @js.native
  trait IKeytipTreeNode extends StObject {
    
    /**
      * List of keytip IDs that should become visible when this keytip is pressed, can be empty
      */
    var children: js.Array[String] = js.native
    
    /**
      * T/F if this keytip's component is currently disabled
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not this keytip will have children keytips that are dynamically created (DOM is generated on
      * keytip activation). Common cases are keytips in a menu or modal.
      */
    var hasDynamicChildren: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not this keytip belongs to a component that has a menu
      * Keytip mode will stay on when a menu is opened, even if the items in that menu have no keytips
      */
    var hasMenu: js.UndefOr[Boolean] = js.native
    
    /**
      * ID of the <Keytip> DOM element. Needed to locate the correct keytip in the KeytipLayer's 'keytip' state array
      */
    var id: String = js.native
    
    /**
      * KeySequence that invokes this KeytipTreeNode's onExecute function
      */
    var keySequences: js.Array[String] = js.native
    
    /**
      * Control's execute function for when keytip is invoked, passed from the component to the Manager in the IKeytipProps
      */
    var onExecute: js.UndefOr[
        js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
      ] = js.native
    
    /**
      * Function to execute when we return to this keytip
      */
    var onReturn: js.UndefOr[
        js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
      ] = js.native
    
    /**
      * Overflow set sequence for this keytip
      */
    var overflowSetSequence: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Parent keytip ID
      */
    var parent: String = js.native
    
    /**
      * T/F if this keytip is a persisted keytip
      */
    var persisted: js.UndefOr[Boolean] = js.native
  }
  object IKeytipTreeNode {
    
    @scala.inline
    def apply(children: js.Array[String], id: String, keySequences: js.Array[String], parent: String): IKeytipTreeNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeytipTreeNode]
    }
    
    @scala.inline
    implicit class IKeytipTreeNodeMutableBuilder[Self <: IKeytipTreeNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHasDynamicChildren(value: Boolean): Self = StObject.set(x, "hasDynamicChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasDynamicChildrenUndefined: Self = StObject.set(x, "hasDynamicChildren", js.undefined)
      
      @scala.inline
      def setHasMenu(value: Boolean): Self = StObject.set(x, "hasMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasMenuUndefined: Self = StObject.set(x, "hasMenu", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySequences(value: js.Array[String]): Self = StObject.set(x, "keySequences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySequencesVarargs(value: String*): Self = StObject.set(x, "keySequences", js.Array(value :_*))
      
      @scala.inline
      def setOnExecute(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): Self = StObject.set(x, "onExecute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnExecuteUndefined: Self = StObject.set(x, "onExecute", js.undefined)
      
      @scala.inline
      def setOnReturn(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): Self = StObject.set(x, "onReturn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnReturnUndefined: Self = StObject.set(x, "onReturn", js.undefined)
      
      @scala.inline
      def setOverflowSetSequence(value: js.Array[String]): Self = StObject.set(x, "overflowSetSequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowSetSequenceUndefined: Self = StObject.set(x, "overflowSetSequence", js.undefined)
      
      @scala.inline
      def setOverflowSetSequenceVarargs(value: String*): Self = StObject.set(x, "overflowSetSequence", js.Array(value :_*))
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersisted(value: Boolean): Self = StObject.set(x, "persisted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistedUndefined: Self = StObject.set(x, "persisted", js.undefined)
    }
  }
}
