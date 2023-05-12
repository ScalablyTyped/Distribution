package typings.metroFileMap.srcFlowTypesMod

import typings.metroFileMap.metroFileMapInts.`0`
import typings.metroFileMap.metroFileMapInts.`1`
import typings.metroFileMap.metroFileMapInts.`2`
import typings.metroFileMap.metroFileMapInts.`3`
import typings.metroFileMap.metroFileMapInts.`4`
import typings.metroFileMap.metroFileMapInts.`5`
import typings.metroFileMap.metroFileMapInts.`6`
import typings.metroFileMap.metroFileMapStrings.Null
import typings.metroFileMap.metroFileMapStrings.g
import typings.metroFileMap.metroFileMapStrings.native
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HType extends StObject {
  
  var DEPENDENCIES: `4`
  
  var DEPENDENCY_DELIM: Null
  
  var GENERIC_PLATFORM: g
  
  var ID: `0`
  
  var MODULE: `0`
  
  var MTIME: `1`
  
  var NATIVE_PLATFORM: native
  
  var PACKAGE: `1`
  
  var PATH: `0`
  
  var SHA1: `5`
  
  var SIZE: `2`
  
  var SYMLINK: `6`
  
  var TYPE: `1`
  
  var VISITED: `3`
}
object HType {
  
  inline def apply(): HType = {
    val __obj = js.Dynamic.literal(DEPENDENCIES = 4, DEPENDENCY_DELIM = "\u0000", GENERIC_PLATFORM = "g", ID = 0, MODULE = 0, MTIME = 1, NATIVE_PLATFORM = "native", PACKAGE = 1, PATH = 0, SHA1 = 5, SIZE = 2, SYMLINK = 6, TYPE = 1, VISITED = 3)
    __obj.asInstanceOf[HType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HType] (val x: Self) extends AnyVal {
    
    inline def setDEPENDENCIES(value: `4`): Self = StObject.set(x, "DEPENDENCIES", value.asInstanceOf[js.Any])
    
    inline def setDEPENDENCY_DELIM(value: Null): Self = StObject.set(x, "DEPENDENCY_DELIM", value.asInstanceOf[js.Any])
    
    inline def setGENERIC_PLATFORM(value: g): Self = StObject.set(x, "GENERIC_PLATFORM", value.asInstanceOf[js.Any])
    
    inline def setID(value: `0`): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setMODULE(value: `0`): Self = StObject.set(x, "MODULE", value.asInstanceOf[js.Any])
    
    inline def setMTIME(value: `1`): Self = StObject.set(x, "MTIME", value.asInstanceOf[js.Any])
    
    inline def setNATIVE_PLATFORM(value: native): Self = StObject.set(x, "NATIVE_PLATFORM", value.asInstanceOf[js.Any])
    
    inline def setPACKAGE(value: `1`): Self = StObject.set(x, "PACKAGE", value.asInstanceOf[js.Any])
    
    inline def setPATH(value: `0`): Self = StObject.set(x, "PATH", value.asInstanceOf[js.Any])
    
    inline def setSHA1(value: `5`): Self = StObject.set(x, "SHA1", value.asInstanceOf[js.Any])
    
    inline def setSIZE(value: `2`): Self = StObject.set(x, "SIZE", value.asInstanceOf[js.Any])
    
    inline def setSYMLINK(value: `6`): Self = StObject.set(x, "SYMLINK", value.asInstanceOf[js.Any])
    
    inline def setTYPE(value: `1`): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
    
    inline def setVISITED(value: `3`): Self = StObject.set(x, "VISITED", value.asInstanceOf[js.Any])
  }
}
