package typings.multiformats.anon

import typings.multiformats.distTypesSrcCidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.ToString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty[Data /* <: Any */, Format /* <: Double */, Alg /* <: Double */, Version /* <: typings.multiformats.distTypesSrcLinkInterfaceMod.Version */] extends StObject {
  
  @JSName("/")
  var Slash: ToString[CID[Data, Format, Alg, Version], String]
}
object _empty {
  
  inline def apply[Data /* <: Any */, Format /* <: Double */, Alg /* <: Double */, Version /* <: typings.multiformats.distTypesSrcLinkInterfaceMod.Version */](Slash: ToString[CID[Data, Format, Alg, Version], String]): _empty[Data, Format, Alg, Version] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("/")(Slash.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty[Data, Format, Alg, Version]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: _empty[?, ?, ?, ?], Data /* <: Any */, Format /* <: Double */, Alg /* <: Double */, Version /* <: typings.multiformats.distTypesSrcLinkInterfaceMod.Version */] (val x: Self & (_empty[Data, Format, Alg, Version])) extends AnyVal {
    
    inline def setSlash(value: ToString[CID[Data, Format, Alg, Version], String]): Self = StObject.set(x, "/", value.asInstanceOf[js.Any])
  }
}
