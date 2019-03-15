package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object phinLib {
  type AnyResponse = BatchResponse | StreamResponse
  type BatchResponse = JsonResponse | BufferResponse
  type BufferResponse = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Phin.BufferResponse */ js.Any
  type DefaultOpts = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Phin.DefaultOpts */ js.Any
  type JsonResponse = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Phin.JsonResponse */ js.Any
  type Options = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Phin.Options */ js.Any
  type StreamResponse = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Phin.StreamResponse */ js.Any
}
