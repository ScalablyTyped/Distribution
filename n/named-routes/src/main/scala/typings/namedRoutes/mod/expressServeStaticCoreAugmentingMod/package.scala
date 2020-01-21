package typings.namedRoutes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressServeStaticCoreAugmentingMod {
  // tslint:disable-next-line interface-name
  type IRouterMatcher[T] = js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathParams */ /* path */ js.Any, 
    /* name */ java.lang.String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestHandler */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestHandler */ /* repeated */ js.Any, 
    T
  ]
}
