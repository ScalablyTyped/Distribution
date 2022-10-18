package typings.nextAuth.anon

import typings.nextAuth.nextAuthStrings.a
import typings.nextAuth.nextAuthStrings.b
import typings.nextAuth.nextAuthStrings.c
import typings.nextAuth.nextAuthStrings.d
import typings.nextAuth.nextAuthStrings.e
import typings.nextAuth.nextAuthStrings.f_
import typings.nextAuth.nextAuthStrings.g
import typings.nextAuth.nextAuthStrings.h
import typings.nextAuth.nextAuthStrings.i
import typings.nextAuth.nextAuthStrings.j
import typings.nextAuth.nextAuthStrings.k
import typings.nextAuth.nextAuthStrings.l
import typings.nextAuth.nextAuthStrings.m_
import typings.nextAuth.nextAuthStrings.max
import typings.nextAuth.nextAuthStrings.n
import typings.nextAuth.nextAuthStrings.o
import typings.nextAuth.nextAuthStrings.p
import typings.nextAuth.nextAuthStrings.q
import typings.nextAuth.nextAuthStrings.r
import typings.nextAuth.nextAuthStrings.s
import typings.nextAuth.nextAuthStrings.temp
import typings.nextAuth.nextAuthStrings.w
import typings.nextAuth.nextAuthStrings.x
import typings.nextAuth.nextAuthStrings.y
import typings.nextAuth.nextAuthStrings.z
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Src extends StObject {
  
  var height: Double
  
  var src: js.UndefOr[String] = js.undefined
  
  var `type`: s | m_ | x | o | p | q | r | k | l | y | z | c | w | a | b | e | i | d | j | temp | h | g | n | f_ | max
  
  var url: String
  
  var width: Double
}
object Src {
  
  inline def apply(
    height: Double,
    `type`: s | m_ | x | o | p | q | r | k | l | y | z | c | w | a | b | e | i | d | j | temp | h | g | n | f_ | max,
    url: String,
    width: Double
  ): Src = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Src]
  }
  
  extension [Self <: Src](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setType(
      value: s | m_ | typings.nextAuth.nextAuthStrings.x | o | p | q | r | k | l | y | z | c | w | a | b | e | i | d | j | temp | h | g | n | f_ | max
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
