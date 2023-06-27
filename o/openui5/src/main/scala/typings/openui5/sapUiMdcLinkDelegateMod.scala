package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.sapUiMdcLinkMod.LinkTypeWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcLinkDelegateMod extends Shortcut {
  
  @JSImport("sap/ui/mdc/LinkDelegate", JSImport.Default)
  @js.native
  val default: LinkDelegate = js.native
  
  /**
    * @since 1.74
    *
    * Base delegate for {@link sap.ui.mdc.Link}. Extend this object in your project to use all functionalities
    * of the {@link sap.ui.mdc.Link}. **Note:** The delegate is experimental and the API/behaviour is not finalized
    * and hence this should not be used for productive usage.
    */
  @js.native
  trait LinkDelegate extends StObject {
    
    /**
      * Allows for interception before the actual navigation takes place.
      *
      * @returns Once resolved, it returns a Boolean value that determines whether the navigation takes place
      */
    def beforeNavigationCallback(
      /**
      * Instance of the `Link`
      */
    oLink: typings.openui5.sapUiMdcLinkMod.default,
      /**
      * The `pressLink` event that is fired by the `Link` control
      */
    oEvent: typings.openui5.sapUiBaseEventMod.default[js.Object]
    ): js.Promise[Boolean] = js.native
    
    /**
      * Retrieves and returns the relevant `additionalContent` for the `Link` control as an array.
      *
      * @returns Once resolved, an array of {@link sap.ui.core.Control} is returned
      */
    def fetchAdditionalContent(/**
      * Instance of the `Link` control
      */
    oLink: typings.openui5.sapUiMdcLinkMod.default): js.Promise[js.Array[typings.openui5.sapUiCoreControlMod.default]] = js.native
    
    def fetchLinkItems(
      /**
      * Instance of the `Link`
      */
    oLink: typings.openui5.sapUiMdcLinkMod.default,
      /**
      * Binding context of the `Link` control
      */
    oBindingContext: Null,
      /**
      * InfoLog of the `Link` control
      */
    oInfoLog: /* was: sap.ui.mdc.link.Log */ Any
    ): js.Promise[Null | js.Array[typings.openui5.sapUiMdcLinkLinkItemMod.default]] = js.native
    def fetchLinkItems(
      /**
      * Instance of the `Link`
      */
    oLink: typings.openui5.sapUiMdcLinkMod.default,
      /**
      * Binding context of the `Link` control
      */
    oBindingContext: Unit,
      /**
      * InfoLog of the `Link` control
      */
    oInfoLog: /* was: sap.ui.mdc.link.Log */ Any
    ): js.Promise[Null | js.Array[typings.openui5.sapUiMdcLinkLinkItemMod.default]] = js.native
    /**
      * Retrieves and returns the relevant {@link sap.ui.mdc.link.LinkItem} for the `Link` control.
      *
      * @returns Once resolved, `null` or an array of {@link sap.ui.mdc.link.LinkItem} is returned If `null`
      * is returned, the link won't cache `LinkItem`.
      */
    def fetchLinkItems(
      /**
      * Instance of the `Link`
      */
    oLink: typings.openui5.sapUiMdcLinkMod.default,
      /**
      * Binding context of the `Link` control
      */
    oBindingContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * InfoLog of the `Link` control
      */
    oInfoLog: /* was: sap.ui.mdc.link.Log */ Any
    ): js.Promise[Null | js.Array[typings.openui5.sapUiMdcLinkLinkItemMod.default]] = js.native
    
    /**
      * Calculates and returns the type of link that is displayed.
      *
      * @returns Once resolved, an object containing an initial {@link sap.ui.mdc.link.LinkType} and an optional
      * `Promise` are returned. The optional `Promise` also returns a {@link sap.ui.mdc.link.LinkType} object.
      * Once the optional `Promise` has been resolved, the returned {@link sap.ui.mdc.link.LinkType} overwrites
      * the `initialType`.
      */
    def fetchLinkType(/**
      * Instance of the `Link`
      */
    oLink: typings.openui5.sapUiMdcLinkMod.default): js.Promise[LinkTypeWrapper] = js.native
    
    def modifyLinkItems(
      /**
      * Instance of the `Link`
      */
    oLink: typings.openui5.sapUiMdcLinkMod.default,
      /**
      * Binding context of the `Link` control
      */
    oBindingContext: Null,
      /**
      * The {@link sap.ui.mdc.link.LinkItem} instances of the link that can be modified
      */
    aLinkItems: typings.openui5.sapUiMdcLinkLinkItemMod.default
    ): js.Promise[js.Array[typings.openui5.sapUiMdcLinkLinkItemMod.default]] = js.native
    def modifyLinkItems(
      /**
      * Instance of the `Link`
      */
    oLink: typings.openui5.sapUiMdcLinkMod.default,
      /**
      * Binding context of the `Link` control
      */
    oBindingContext: Unit,
      /**
      * The {@link sap.ui.mdc.link.LinkItem} instances of the link that can be modified
      */
    aLinkItems: typings.openui5.sapUiMdcLinkLinkItemMod.default
    ): js.Promise[js.Array[typings.openui5.sapUiMdcLinkLinkItemMod.default]] = js.native
    /**
      * Enables the modification of the {@link sap.ui.mdc.link.LinkItem} instances before the popover opens.
      * This enables additional parameters to be added to the link.
      *
      * @returns Once resolved, an array of link items is returned
      */
    def modifyLinkItems(
      /**
      * Instance of the `Link`
      */
    oLink: typings.openui5.sapUiMdcLinkMod.default,
      /**
      * Binding context of the `Link` control
      */
    oBindingContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The {@link sap.ui.mdc.link.LinkItem} instances of the link that can be modified
      */
    aLinkItems: typings.openui5.sapUiMdcLinkLinkItemMod.default
    ): js.Promise[js.Array[typings.openui5.sapUiMdcLinkLinkItemMod.default]] = js.native
  }
  
  type _To = LinkDelegate
  
  /* This means you don't have to write `default`, but can instead just say `sapUiMdcLinkDelegateMod.foo` */
  override def _to: LinkDelegate = default
}
