package typings.next.anon

import typings.next.libUtilsMod.DocumentProps
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderDocument extends StObject {
  
  def renderDocument(
    Document: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.DocumentType */ js.Object,
    props: DocumentProps
  ): ReactElement
}
object RenderDocument {
  
  inline def apply(
    renderDocument: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.DocumentType */ js.Object, DocumentProps) => ReactElement
  ): RenderDocument = {
    val __obj = js.Dynamic.literal(renderDocument = js.Any.fromFunction2(renderDocument))
    __obj.asInstanceOf[RenderDocument]
  }
  
  extension [Self <: RenderDocument](x: Self) {
    
    inline def setRenderDocument(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.DocumentType */ js.Object, DocumentProps) => ReactElement
    ): Self = StObject.set(x, "renderDocument", js.Any.fromFunction2(value))
  }
}
