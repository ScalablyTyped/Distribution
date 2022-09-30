package typings.mirrorx.mod

import typings.mirrorx.mirrorxStrings.`match`
import typings.mirrorx.mirrorxStrings.history
import typings.mirrorx.mirrorxStrings.location
import typings.mirrorx.mirrorxStrings.staticContext
import typings.mirrorx.mod.^
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactRedux.connectMod.Connect
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def actions: Actions_ = ^.asInstanceOf[js.Dynamic].selectDynamic("actions").asInstanceOf[Actions_]

inline def connect: Connect[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("connect").asInstanceOf[Connect[Any]]

inline def defaults(): js.Function1[/* options */ defaultOptions, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[js.Function1[/* options */ defaultOptions, Unit]]

inline def hook(): js.Function1[/* subscriber */ js.Function0[Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hook")().asInstanceOf[js.Function1[/* subscriber */ js.Function0[Any], Any]]

inline def render: Renderer = ^.asInstanceOf[js.Dynamic].selectDynamic("render").asInstanceOf[Renderer]

inline def withRouter[P /* <: RouteComponentProps[Any] */](component: ComponentType[P]): ComponentClass[
Omit[
  P, 
  /* keyof mirrorx.mirrorx.RouteComponentProps<any> */ `match` | location | history | staticContext
], 
ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[
Omit[
  P, 
  /* keyof mirrorx.mirrorx.RouteComponentProps<any> */ `match` | location | history | staticContext
], 
ComponentState]]
inline def withRouter[TFunction /* <: ComponentClass[Any, ComponentState] */](target: TFunction): TFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(target.asInstanceOf[js.Any]).asInstanceOf[TFunction]

type Omit[T, K /* <: /* keyof T */ String */] = Pick[
T, 
/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any]
