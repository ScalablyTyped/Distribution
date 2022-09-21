package typings.node.processMod.global.NodeJS

import typings.node.nodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReadWriteStream * / any */ trait Socket extends StObject {
  
  var isTTY: js.UndefOr[`true`] = js.undefined
}
object Socket {
  
  inline def apply(): Socket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Socket]
  }
  
  extension [Self <: Socket](x: Self) {
    
    inline def setIsTTY(value: `true`): Self = StObject.set(x, "isTTY", value.asInstanceOf[js.Any])
    
    inline def setIsTTYUndefined: Self = StObject.set(x, "isTTY", js.undefined)
  }
}
