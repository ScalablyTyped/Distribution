package typings.nextAuth.anon

import typings.nextAuth.nextAuthStrings.l
import typings.nextAuth.nextAuthStrings.m_
import typings.nextAuth.nextAuthStrings.o
import typings.nextAuth.nextAuthStrings.p
import typings.nextAuth.nextAuthStrings.q
import typings.nextAuth.nextAuthStrings.r
import typings.nextAuth.nextAuthStrings.s
import typings.nextAuth.nextAuthStrings.w
import typings.nextAuth.nextAuthStrings.x
import typings.nextAuth.nextAuthStrings.y
import typings.nextAuth.nextAuthStrings.z
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[s | m_ | x | l | o | p | q | r | y | z | w] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Height {
  
  inline def apply(): Height = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Height]
  }
  
  extension [Self <: Height](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setType(value: s | m_ | typings.nextAuth.nextAuthStrings.x | l | o | p | q | r | y | z | w): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
