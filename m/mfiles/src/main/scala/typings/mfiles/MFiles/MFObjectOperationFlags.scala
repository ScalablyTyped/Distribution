package typings.mfiles.MFiles

import typings.mfiles.mfilesInts.`0`
import typings.mfiles.mfilesInts.`16`
import typings.mfiles.mfilesInts.`1`
import typings.mfiles.mfilesInts.`2`
import typings.mfiles.mfilesInts.`32`
import typings.mfiles.mfilesInts.`4`
import typings.mfiles.mfilesInts.`64`
import typings.mfiles.mfilesInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mfiles.mfilesInts.`0`
  - typings.mfiles.mfilesInts.`1`
  - typings.mfiles.mfilesInts.`2`
  - typings.mfiles.mfilesInts.`4`
  - typings.mfiles.mfilesInts.`8`
  - typings.mfiles.mfilesInts.`16`
  - typings.mfiles.mfilesInts.`32`
  - typings.mfiles.mfilesInts.`64`
*/
trait MFObjectOperationFlags extends StObject
object MFObjectOperationFlags {
  
  inline def ChangeACLInAllVersions: `32` = 32.asInstanceOf[`32`]
  
  inline def DisallowNameChange: `4` = 4.asInstanceOf[`4`]
  
  inline def None: `0` = 0.asInstanceOf[`0`]
  
  inline def RequireChangeSecurityAccess: `8` = 8.asInstanceOf[`8`]
  
  inline def RequireEditAccess: `2` = 2.asInstanceOf[`2`]
  
  inline def RequireFullAccess: `16` = 16.asInstanceOf[`16`]
  
  inline def RequireReadAccess: `1` = 1.asInstanceOf[`1`]
  
  inline def RequireSomeAccess: `64` = 64.asInstanceOf[`64`]
}
