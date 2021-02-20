package typings.ngDialog

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IPromise
import typings.angular.mod.IRootScopeService
import typings.angular.mod.IServiceProvider
import typings.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type IDialogClosePromise = typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogClosePromise
  
  type IDialogConfirmScope = typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogConfirmScope
  
  type IDialogOpenConfirmOptions = typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOpenConfirmOptions
  
  type IDialogOpenOptions = typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOpenOptions
  
  type IDialogOpenResult = typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOpenResult
  
  type IDialogOptions = typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOptions
  
  type IDialogProvider = typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogProvider
  
  type IDialogScope = typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogScope
  
  type IDialogService = typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogService
  
  /* augmented module */
  object angularAugmentingMod {
    
    object dialog {
      
      @js.native
      trait IDialogClosePromise extends StObject {
        
        var id: String = js.native
        
        var value: js.Any = js.native
      }
      object IDialogClosePromise {
        
        @scala.inline
        def apply(id: String, value: js.Any): typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogClosePromise = {
          val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogClosePromise]
        }
        
        @scala.inline
        implicit class IDialogClosePromiseMutableBuilder[Self <: typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogClosePromise] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait IDialogConfirmScope
        extends typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogScope {
        
        /**
          * Use this method to close the dialog and resolve the promise that was returned when opening the modal.
          *
          * The function accepts a single optional parameter which is used as the value of the resolved promise.
          * @param {any} [value] - The value with which the promise will resolve
          */
        def confirm(): Unit = js.native
        def confirm(value: js.Any): Unit = js.native
      }
      
      @js.native
      trait IDialogOpenConfirmOptions
        extends typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOpenOptions {
        
        @JSName("scope")
        var scope_IDialogOpenConfirmOptions: js.UndefOr[typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogConfirmScope] = js.native
      }
      object IDialogOpenConfirmOptions {
        
        @scala.inline
        def apply(template: String): typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOpenConfirmOptions = {
          val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOpenConfirmOptions]
        }
        
        @scala.inline
        implicit class IDialogOpenConfirmOptionsMutableBuilder[Self <: typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOpenConfirmOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setScope(value: typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogConfirmScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        }
      }
      
      /**
        * Options which are provided to open a dialog.
        */
      @js.native
      trait IDialogOpenOptions
        extends typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOptions {
        
        var bindToController: js.UndefOr[Boolean] = js.native
        
        var controller: js.UndefOr[String | js.Array[_] | js.Any] = js.native
        
        var controllerAs: js.UndefOr[String] = js.native
        
        /**
          * Any serializable data that you want to be stored in the controller's dialog scope. ($scope.ngDialogData).
          * From version 0.3.6 $scope.ngDialogData keeps references to the objects instead of copying them.
          */
        var data: js.UndefOr[String | js.Object | js.Array[_]] = js.native
        
        /**
          * An optional map of dependencies which should be injected into the controller. If any of these dependencies
          * are promises, ngDialog will wait for them all to be resolved or one to be rejected before the controller
          * is instantiated.
          */
        var resolve: js.UndefOr[StringDictionary[String | Function]] = js.native
        
        /**
          * Scope object that will be passed to dialog. If you use controller with separate $scope service this object will be passed to $scope.$parent param.
          */
        var scope: js.UndefOr[typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogScope] = js.native
        
        var template: String = js.native
      }
      object IDialogOpenOptions {
        
        @scala.inline
        def apply(template: String): typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOpenOptions = {
          val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOpenOptions]
        }
        
        @scala.inline
        implicit class IDialogOpenOptionsMutableBuilder[Self <: typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOpenOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBindToController(value: Boolean): Self = StObject.set(x, "bindToController", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBindToControllerUndefined: Self = StObject.set(x, "bindToController", js.undefined)
          
          @scala.inline
          def setController(value: String | js.Array[_] | js.Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
          
          @scala.inline
          def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
          
          @scala.inline
          def setControllerVarargs(value: js.Any*): Self = StObject.set(x, "controller", js.Array(value :_*))
          
          @scala.inline
          def setData(value: String | js.Object | js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
          
          @scala.inline
          def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
          
          @scala.inline
          def setResolve(value: StringDictionary[String | Function]): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
          
          @scala.inline
          def setScope(value: typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
          
          @scala.inline
          def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait IDialogOpenResult extends StObject {
        
        def close(): Unit = js.native
        def close(value: js.Any): Unit = js.native
        
        var closePromise: IPromise[typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogClosePromise] = js.native
        
        var id: String = js.native
      }
      
      @js.native
      trait IDialogOptions extends StObject {
        
        /**
          * Unlike the className property, which overrides any default classes specified through the setDefaults() method (see docs), appendClassName allows for the addition of a class on top of any defaults.
          */
        var appendClassName: js.UndefOr[String] = js.native
        
        /**
          * Specify your element where to append dialog instance, accepts selector string (e.g. #yourId, .yourClass).
          * If not specified appends dialog to body as default behavior.
          */
        var appendTo: js.UndefOr[String] = js.native
        
        /**
          * When true, automatically selects appropriate values for any unspecified accessibility attributes. Default value is true
          */
        var ariaAuto: js.UndefOr[Boolean] = js.native
        
        /**
          * Specifies the value for the aria-describedby attribute that should be applied to the dialog element. Default value is null (unspecified)
          *
          * If specified, the value is not validated against the DOM.
          */
        var ariaDescribedById: js.UndefOr[String] = js.native
        
        /**
          * Specifies the CSS selector for the element to be referenced by the aria-describedby attribute on the dialog element. Default value is null (unspecified)
          *
          * If specified, the first matching element is used.
          */
        var ariaDescribedBySelector: js.UndefOr[String] = js.native
        
        /**
          * Specifies the value for the aria-labelledby attribute that should be applied to the dialog element.
          * Default value is null (unspecified)
          *
          * If specified, the value is not validated against the DOM
          */
        var ariaLabelledById: js.UndefOr[String] = js.native
        
        /**
          * Specifies the CSS selector for the element to be referenced by the aria-labelledby attribute on the dialog element. Default value is null (unspecified)
          *
          * If specified, the first matching element is used.
          */
        var ariaLabelledBySelector: js.UndefOr[String] = js.native
        
        /**
          * Specifies the value for the role attribute that should be applied to the dialog element. Default value is null (unspecified)
          */
        var ariaRole: js.UndefOr[String] = js.native
        
        /**
          * Pass false to disable template caching. Useful for developing purposes, default is true.
          */
        var cache: js.UndefOr[Boolean] = js.native
        
        /**
          * This option allows you to control the dialog's look, you can use built-in themes or create your own styled modals.
          * It will be appended with the "ngdialog" class e.g. className is "default-theme flat-ui" it will be class="ngdialog default-theme flat-ui".
          */
        var className: js.UndefOr[String] = js.native
        
        /**
          * It allows to close modals by clicking on overlay background, default true. If @see Hammer.js is loaded, it will listen for tap instead of click.
          */
        var closeByDocument: js.UndefOr[Boolean] = js.native
        
        /**
          * It allows to close modals by clicking Esc button, default true.
          * This will close all open modals if there several of them open at the same time.
          */
        var closeByEscape: js.UndefOr[Boolean] = js.native
        
        /**
          * Listens for $locationChangeSuccess event and closes open dialogs if true (also handles the ui.router $stateChangeSuccess event if ui.router is used)
          * default : false
          */
        var closeByNavigation: js.UndefOr[Boolean] = js.native
        
        /**
          * If true then animation for the dialog will be disabled, default false.
          */
        var disableAnimation: js.UndefOr[Boolean] = js.native
        
        /**
          * Specifies the height of the dialog content element. Default value is null (unspecified)
          */
        var height: js.UndefOr[String | Double] = js.native
        
        /**
          * Give a name for a dialog instance. It is useful for identifying specific dialog if there are multiple dialog boxes opened.
          */
        var name: js.UndefOr[String | Double] = js.native
        
        /**
          * If false it allows to hide overlay div behind the modals, default true.
          */
        var overlay: js.UndefOr[Boolean] = js.native
        
        /**
          * If true allows to use plain string as template, default false.
          */
        var plain: js.UndefOr[Boolean] = js.native
        
        /**
          * Provide either the name of a function or a function to be called before the dialog is closed.
          * If the callback function specified in the option returns false then the dialog will not be closed.
          * Alternatively, if the callback function returns a promise that gets resolved the dialog will be closed.
          *
          * more: https://github.com/likeastore/ngDialog#preclosecallback-string--function
          */
        var preCloseCallback: js.UndefOr[String | Function] = js.native
        
        /**
          * When true, closing the dialog restores focus to the element that launched it. Designed to improve keyboard
          * accessibility. Default value is true
          */
        var preserveFocus: js.UndefOr[Boolean] = js.native
        
        /**
          * If false it allows to hide close button on modals, default true.
          */
        var showClose: js.UndefOr[Boolean] = js.native
        
        /**
          * When true, ensures that the focused element remains within the dialog to conform to accessibility recommendations.
          * Default value is true
          */
        var trapFocus: js.UndefOr[Boolean] = js.native
        
        /**
          * Specifies the width of the dialog content element. Default value is null (unspecified)
          */
        var width: js.UndefOr[String | Double] = js.native
      }
      object IDialogOptions {
        
        @scala.inline
        def apply(): typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOptions]
        }
        
        @scala.inline
        implicit class IDialogOptionsMutableBuilder[Self <: typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAppendClassName(value: String): Self = StObject.set(x, "appendClassName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAppendClassNameUndefined: Self = StObject.set(x, "appendClassName", js.undefined)
          
          @scala.inline
          def setAppendTo(value: String): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
          
          @scala.inline
          def setAriaAuto(value: Boolean): Self = StObject.set(x, "ariaAuto", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAriaAutoUndefined: Self = StObject.set(x, "ariaAuto", js.undefined)
          
          @scala.inline
          def setAriaDescribedById(value: String): Self = StObject.set(x, "ariaDescribedById", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAriaDescribedByIdUndefined: Self = StObject.set(x, "ariaDescribedById", js.undefined)
          
          @scala.inline
          def setAriaDescribedBySelector(value: String): Self = StObject.set(x, "ariaDescribedBySelector", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAriaDescribedBySelectorUndefined: Self = StObject.set(x, "ariaDescribedBySelector", js.undefined)
          
          @scala.inline
          def setAriaLabelledById(value: String): Self = StObject.set(x, "ariaLabelledById", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAriaLabelledByIdUndefined: Self = StObject.set(x, "ariaLabelledById", js.undefined)
          
          @scala.inline
          def setAriaLabelledBySelector(value: String): Self = StObject.set(x, "ariaLabelledBySelector", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAriaLabelledBySelectorUndefined: Self = StObject.set(x, "ariaLabelledBySelector", js.undefined)
          
          @scala.inline
          def setAriaRole(value: String): Self = StObject.set(x, "ariaRole", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAriaRoleUndefined: Self = StObject.set(x, "ariaRole", js.undefined)
          
          @scala.inline
          def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
          
          @scala.inline
          def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
          
          @scala.inline
          def setCloseByDocument(value: Boolean): Self = StObject.set(x, "closeByDocument", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCloseByDocumentUndefined: Self = StObject.set(x, "closeByDocument", js.undefined)
          
          @scala.inline
          def setCloseByEscape(value: Boolean): Self = StObject.set(x, "closeByEscape", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCloseByEscapeUndefined: Self = StObject.set(x, "closeByEscape", js.undefined)
          
          @scala.inline
          def setCloseByNavigation(value: Boolean): Self = StObject.set(x, "closeByNavigation", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCloseByNavigationUndefined: Self = StObject.set(x, "closeByNavigation", js.undefined)
          
          @scala.inline
          def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
          
          @scala.inline
          def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
          
          @scala.inline
          def setName(value: String | Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
          
          @scala.inline
          def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
          
          @scala.inline
          def setPreCloseCallback(value: String | Function): Self = StObject.set(x, "preCloseCallback", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPreCloseCallbackUndefined: Self = StObject.set(x, "preCloseCallback", js.undefined)
          
          @scala.inline
          def setPreserveFocus(value: Boolean): Self = StObject.set(x, "preserveFocus", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPreserveFocusUndefined: Self = StObject.set(x, "preserveFocus", js.undefined)
          
          @scala.inline
          def setShowClose(value: Boolean): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setShowCloseUndefined: Self = StObject.set(x, "showClose", js.undefined)
          
          @scala.inline
          def setTrapFocus(value: Boolean): Self = StObject.set(x, "trapFocus", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
          
          @scala.inline
          def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        }
      }
      
      @js.native
      trait IDialogProvider extends IServiceProvider {
        
        /**
          * Default options for the dialogs.
          * @param defaultOptions
          * @returns {}
          */
        def setDefaults(defaultOptions: typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOptions): Unit = js.native
        
        /**
          * Adds additional listener on every $locationChangeSuccess event and gets updated version of body into dialog.
          * Maybe useful in some rare cases when you're dependant on DOM changes, defaults to false. Use it in module's
          * config as provider instance:
          * @param {boolean} force
          */
        def setForceBodyReload(force: Boolean): Unit = js.native
        
        /**
          * Adds an additional listener on every $locationChangeSuccess event and gets update version of html into dialog.
          * May be useful in some rare cases when you're dependant on DOM changes, defaults to false.
          * @param {boolean} force
          */
        def setForceHtmlReload(force: Boolean): Unit = js.native
      }
      object IDialogProvider {
        
        @scala.inline
        def apply(
          $get: js.Any,
          setDefaults: typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOptions => Unit,
          setForceBodyReload: Boolean => Unit,
          setForceHtmlReload: Boolean => Unit
        ): typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogProvider = {
          val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], setDefaults = js.Any.fromFunction1(setDefaults), setForceBodyReload = js.Any.fromFunction1(setForceBodyReload), setForceHtmlReload = js.Any.fromFunction1(setForceHtmlReload))
          __obj.asInstanceOf[typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogProvider]
        }
        
        @scala.inline
        implicit class IDialogProviderMutableBuilder[Self <: typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogProvider] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setSetDefaults(value: typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOptions => Unit): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1(value))
          
          @scala.inline
          def setSetForceBodyReload(value: Boolean => Unit): Self = StObject.set(x, "setForceBodyReload", js.Any.fromFunction1(value))
          
          @scala.inline
          def setSetForceHtmlReload(value: Boolean => Unit): Self = StObject.set(x, "setForceHtmlReload", js.Any.fromFunction1(value))
        }
      }
      
      /**
        * Dialog Scope which extends the $scope.
        */
      @js.native
      trait IDialogScope extends IRootScopeService {
        
        /**
          * This allows you to close dialog straight from handler in a popup element.
          * @param value Any value passed to this function will be attached to the object which resolves on the close promise for this dialog.
          * For dialogs opened with the openConfirm() method the value is used as the reject reason.
          */
        def closeThisDialog(): Unit = js.native
        def closeThisDialog(value: js.Any): Unit = js.native
        
        /**
          * Any serializable data that you want to be stored in the controller's dialog scope.
          * From version 0.3.6 $scope.ngDialogData keeps references to the objects instead of copying them.
          */
        var ngDialogData: String | js.Object | js.Array[_] = js.native
        
        /**
          * The id of the dialog. If you you ngDialogData, it'll be also available under ngDialogData.ngDialogId
          */
        var ngDialogId: String = js.native
      }
      
      @js.native
      trait IDialogService extends StObject {
        
        def close(id: String): Unit = js.native
        def close(id: String, value: js.Any): Unit = js.native
        
        def closeAll(): Unit = js.native
        def closeAll(value: js.Any): Unit = js.native
        
        def getDefaults(): typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOptions = js.native
        
        def getOpenDialogs(): js.Array[String] = js.native
        
        /**
          * Determine whether the specified dialog is open or not.
          * @param id Dialog id to check for.
          * @returns {boolean} Indicating whether it exists or not.
          */
        def isOpen(id: String): Boolean = js.native
        
        def open(options: typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOpenOptions): typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOpenResult = js.native
        
        def openConfirm(options: typings.ngDialog.mod.angularAugmentingMod.dialog.IDialogOpenConfirmOptions): IPromise[_] = js.native
      }
    }
  }
}
