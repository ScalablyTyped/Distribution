package typings.mirrorx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def actions: typings.mirrorx.mod.Actions_ = typings.mirrorx.mod.^.asInstanceOf[js.Dynamic].selectDynamic("actions").asInstanceOf[typings.mirrorx.mod.Actions_]

inline def connect: typings.reactRedux.mod.Connect_[typings.reactRedux.mod.DefaultRootState] = typings.mirrorx.mod.^.asInstanceOf[js.Dynamic].selectDynamic("connect").asInstanceOf[typings.reactRedux.mod.Connect_[typings.reactRedux.mod.DefaultRootState]]

inline def defaults(): js.Function1[/* options */ typings.mirrorx.mod.defaultOptions, scala.Unit] = typings.mirrorx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[js.Function1[/* options */ typings.mirrorx.mod.defaultOptions, scala.Unit]]

inline def hook(): js.Function1[/* subscriber */ js.Function0[js.Any], js.Any] = typings.mirrorx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hook")().asInstanceOf[js.Function1[/* subscriber */ js.Function0[js.Any], js.Any]]

inline def render: typings.mirrorx.mod.Renderer = typings.mirrorx.mod.^.asInstanceOf[js.Dynamic].selectDynamic("render").asInstanceOf[typings.mirrorx.mod.Renderer]

inline def withRouter[P /* <: typings.mirrorx.mod.RouteComponentProps[js.Any] */](component: typings.react.mod.ComponentType[P]): typings.react.mod.ComponentClass[
typings.mirrorx.mod.Omit[
  P, 
  /* keyof mirrorx.mirrorx.RouteComponentProps<any> */ typings.mirrorx.mirrorxStrings.`match` | typings.mirrorx.mirrorxStrings.location | typings.mirrorx.mirrorxStrings.history | typings.mirrorx.mirrorxStrings.staticContext
], 
typings.react.mod.ComponentState] = typings.mirrorx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentClass[
typings.mirrorx.mod.Omit[
  P, 
  /* keyof mirrorx.mirrorx.RouteComponentProps<any> */ typings.mirrorx.mirrorxStrings.`match` | typings.mirrorx.mirrorxStrings.location | typings.mirrorx.mirrorxStrings.history | typings.mirrorx.mirrorxStrings.staticContext
], 
typings.react.mod.ComponentState]]
inline def withRouter[TFunction /* <: typings.react.mod.ComponentClass[js.Any, typings.react.mod.ComponentState] */](target: TFunction): TFunction = typings.mirrorx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(target.asInstanceOf[js.Any]).asInstanceOf[TFunction]

type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[
T, 
/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any]
