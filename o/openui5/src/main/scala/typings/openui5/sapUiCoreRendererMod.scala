package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreRendererMod extends Shortcut {
  
  @JSImport("sap/ui/core/Renderer", JSImport.Default)
  @js.native
  val default: Renderer = js.native
  
  /**
    * Base Class for a Renderer.
    */
  @js.native
  trait Renderer extends StObject {
    
    /**
      * Creates a new renderer that extends a given renderer.
      *
      * This method can be used with two signatures that are explained below. In both variants, the returned
      * renderer inherits all properties (methods, fields) from the given parent renderer. Both variants also
      * add an 'extend' method to the created renderer that behaves like the modern signature variant of this
      * `Renderer.extend` method, but allows to extend the new renderer instead of `sap.ui.core.Renderer`.
      *
      * Modern Signature:
      *
      * In the modern signature variant, two parameters must be given: a qualified name for the new renderer
      * (its global name, in dot-notation), and an optional object literal that contains methods or fields to
      * be added to the new renderer class.
      *
      * This signature has been designed to resemble the class extension mechanism as provided by {@link sap.ui.base.Object.extend
      * Object.extend}.
      *
      *
      * ```javascript
      *
      * sap.ui.define(['sap/ui/core/Renderer'],
      *     function(Renderer) {
      *     "use strict";
      *
      *     var LabelRenderer = Renderer.extend('sap.m.LabelRenderer', {
      *         render: function(oRM, oControl) {
      *
      *             renderPreamble(oRM, oControl);
      *
      *             // implementation core renderer logic here
      *
      *             renderPostamble(oRM, oControl);
      *
      *         },
      *
      *         renderPreamble : function(oRM, oControl) {
      *         ...
      *         },
      *
      *         renderPostamble : function(oRM, oControl) {
      *         ...
      *         }
      *
      *     });
      *
      *     return LabelRenderer;
      * });
      * ```
      *
      *
      * The extension of renderers works across multiple levels. A `FancyLabelRenderer` can extend the above
      * `LabelRenderer`:
      *
      *
      * ```javascript
      *
      * sap.ui.define(['sap/m/LabelRenderer'],
      *     function(LabelRenderer) {
      *     "use strict";
      *
      *     var FancyLabelRenderer = LabelRenderer.extend('sap.mylib.FancyLabelRenderer', {
      *         render: function(oRM, oControl) {
      *
      *             // call base renderer
      *             LabelRenderer.renderPreamble(oRM, oControl);
      *
      *             // ... do your own fancy rendering here
      *
      *             // call base renderer again
      *             LabelRenderer.renderPostamble(oRM, oControl);
      *         }
      *     });
      *
      *     return FancyLabelRenderer;
      * });
      * ```
      *
      *
      * **Note:** The modern signature no longer requires the `bExport` flag to be set for the enclosing {@link
      * sap.ui.define} call. The Renderer base class takes care of the necessary global export of the renderer.
      * This allows non-SAP developers to write a renderer that complies with the documented restriction for
      * `sap.ui.define` (no use of bExport = true outside sap.ui.core projects).
      *
      * Deprecated Signature:
      *
      * The deprecated old signature expects just one parameter: a renderer that should be extended. With that
      * signature, the renderer can't be exported globally as the name of the renderer class is not known.
      *
      * For compatibility reasons, the class created by the deprecated signature contains a property `_super`
      * that references the parent class. It shouldn't be used by applications / control developers as it doesn't
      * work reliably for deeper inheritance chains: if the old variant of `Renderer.extend` is used on two or
      * more levels of the inheritance hierarchy, the `_super` property of the resulting renderer class will
      * always point to the implementation of the base renderer of the last call to extend. Instead of using
      * `this._super`, renderer implementations should use the new signature variant and access the base implementation
      * of a method via the AMD reference to the base renderer (as shown in the FancyLabelRenderer example above).
      *
      * Use as a Generic Method:
      *
      * Only renderers that have been created with a call to `extend` will get their own `extend` method to create
      * new subclasses. To allow extending from older renderers that have been written from scratch as a plain
      * object, the `Renderer.extend` method can be called as a generic method, providing the base renderer
      * as `this`.
      *
      * Example: Derive from `HBoxRenderer` (which is assumed to be a plain object)
      * ```javascript
      *
      * sap.ui.define(['sap/ui/core/Renderer', 'sap/m/HBoxRenderer'],
      *     function(Renderer, HBoxRenderer) {
      *     "use strict";
      *
      *     // Call 'extend' as a generic method, providing the HBoxRenderer as 'this'
      *     var MyRenderer = Renderer.extend.call(HBoxRenderer, 'sap.m.LabelRenderer', {
      *
      *         someOverriddenHook: function(oRM, oControl) {
      *         ...
      *         },
      *
      *     });
      *
      *     return LabelRenderer;
      * });
      * ```
      *
      *
      * **Note:** The deprecated signature cannot be used generically, it is only supported when called on `sap.ui.core.Renderer`.
      *
      * @returns A new renderer that can be enriched further
      */
    def extend(
      /**
      * Either the name of the new renderer class (modern signature) or the base renderer to extend (deprecated
      * signature)
      */
    vName: String
    ): js.Object = js.native
    def extend(
      /**
      * Either the name of the new renderer class (modern signature) or the base renderer to extend (deprecated
      * signature)
      */
    vName: String,
      /**
      * Methods and/or properties that should be added to the new renderer class
      */
    oRendererInfo: js.Object
    ): js.Object = js.native
    def extend(
      /**
      * Either the name of the new renderer class (modern signature) or the base renderer to extend (deprecated
      * signature)
      */
    vName: js.Object
    ): js.Object = js.native
    def extend(
      /**
      * Either the name of the new renderer class (modern signature) or the base renderer to extend (deprecated
      * signature)
      */
    vName: js.Object,
      /**
      * Methods and/or properties that should be added to the new renderer class
      */
    oRendererInfo: js.Object
    ): js.Object = js.native
    
    def getTextAlign(
      /**
      * the text alignment of the Control
      */
    oTextAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String,
      /**
      * the text direction of the Control
      */
    oTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): String = js.native
    def getTextAlign(
      /**
      * the text alignment of the Control
      */
    oTextAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String,
      /**
      * the text direction of the Control
      */
    oTextDirection: TextDirection
    ): String = js.native
    def getTextAlign(
      /**
      * the text alignment of the Control
      */
    oTextAlign: TextAlign,
      /**
      * the text direction of the Control
      */
    oTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): String = js.native
    /**
      * Returns the TextAlignment for the provided configuration.
      *
      * @returns the actual text alignment that must be set for this environment
      */
    def getTextAlign(
      /**
      * the text alignment of the Control
      */
    oTextAlign: TextAlign,
      /**
      * the text direction of the Control
      */
    oTextDirection: TextDirection
    ): String = js.native
  }
  
  type _To = Renderer
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreRendererMod.foo` */
  override def _to: Renderer = default
}
