package typings.nextReduxWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.next.utilsMod.NextPageContext
    - / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppContext * / js.Any
    - typings.nextReduxWrapper.mod.GetStaticPropsContext
    - typings.nextReduxWrapper.mod.GetServerSidePropsContext
  */
  type Context = typings.nextReduxWrapper.mod._Context | typings.next.utilsMod.NextPageContext | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppContext */ js.Any)
  type MakeStore[S, A /* <: typings.redux.mod.Action[_] */] = js.Function1[/* context */ typings.nextReduxWrapper.mod.Context, typings.redux.mod.Store[S, A]]
}
