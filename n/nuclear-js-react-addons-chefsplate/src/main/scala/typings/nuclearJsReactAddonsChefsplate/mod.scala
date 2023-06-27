package typings.nuclearJsReactAddonsChefsplate

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nuclear-js-react-addons-chefsplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Container component allowing a reactor to be exposed via context.
    */
  @JSImport("nuclear-js-react-addons-chefsplate", "Provider")
  @js.native
  val Provider: Any = js.native
  
  /**
    * Connects a React component to a Nuclear.js store.
    *
    * `connect()` provides its connected component with the pieces of the data
    * it needs from the store. This data is supplied via props, which are
    * configured in the passed-in `mapStateToProps` function.
    *
    * `connect()` does not modify the component passed to it; instead, it
    * returns a new, connected component class that wraps the component you
    * passed in.
    *
    * @template TInjectedPropNames Names of props injected by `mapStateToProps`.
    */
  inline def connect[TInjectedPropNames /* <: String | Double | js.Symbol */](mapStateToProps: MapStateToProps[TInjectedPropNames]): ComponentConnector[TInjectedPropNames] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mapStateToProps.asInstanceOf[js.Any]).asInstanceOf[ComponentConnector[TInjectedPropNames]]
  
  /**
    * Provides dataBindings + reactor as props to wrapped component.
    *
    * Example:
    * ```
    * var WrappedComponent = nuclearComponent(Component, function(props) {
    *   return { counter: 'counter' };
    * );
    * ```
    *
    * Also supports the decorator pattern:
    *
    * ```js
    * @nuclearComponent((props) => {
    *   return { counter: 'counter' }
    * })
    * class BaseComponent extends React.Component {
    *   render() {
    *     const { counter, reactor } = this.props;
    *     return <div/>;
    *   }
    * }
    * ```
    *
    * @param [Component] Component to wrap
    * @param [getDataBindings] Function which returns dataBindings to listen for data change
    * @returns Returns function if using decorator pattern
    */
  @JSImport("nuclear-js-react-addons-chefsplate", "nuclearComponent")
  @js.native
  val nuclearComponent: Any = js.native
  
  /**
    * Mixin expecting a context.reactor on the component
    *
    * Should be used if a higher level component has been
    * wrapped with provideReactor
    */
  @JSImport("nuclear-js-react-addons-chefsplate", "nuclearMixin")
  @js.native
  val nuclearMixin: Any = js.native
  
  /**
    * Provides reactor prop to all children as React context
    *
    * Example:
    *   var WrappedComponent = provideReactor(Component, {
    *     foo: React.PropTypes.string
    *   });
    *
    * Also supports the decorator pattern:
    * ```ts
    *   @provideReactor({
    *     foo: React.PropTypes.string
    *   })
    *   class BaseComponent extends React.Component {
    *     render() {
    *       return <div/>;
    *     }
    *   }
    * ```
    *
    * @param [Component] Component to wrap
    * @param [additionalContextTypes] Additional contextTypes to add
    * @returns Returns function if using decorator pattern
    */
  @JSImport("nuclear-js-react-addons-chefsplate", "provideReactor")
  @js.native
  val provideReactor: Any = js.native
  
  // Injects props and removes them from the prop requirements.
  // Will not pass through the injected props if they are passed in during
  // render. Also adds new prop requirements from TNeedsProps.
  type ComponentConnector[TInjectedPropNames /* <: String | Double | js.Symbol */] = js.Function1[
    /* component */ ComponentType[Any], 
    ComponentClass[StrictOmit[Any, TInjectedPropNames], ComponentState]
  ]
  
  // Function that returns getters, which are turned into injected props.
  type MapStateToProps[TInjectedPropNames /* <: String | Double | js.Symbol */] = js.Function1[
    /* props */ js.UndefOr[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ propName in TInjectedPropNames ]: any} */ js.Any
  ]
  
  /**
    * The built-in Omit doesn't error out if omitted key doesn't exist on the main type.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends any ? std.Pick<T, std.Exclude<keyof T, K>> : never
    }}}
    */
  type StrictOmit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
}
