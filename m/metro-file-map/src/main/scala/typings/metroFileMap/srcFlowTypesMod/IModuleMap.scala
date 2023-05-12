package typings.metroFileMap.srcFlowTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModuleMap extends StObject {
  
  def getMockModule(name: String): Path | Null = js.native
  
  def getModule(name: String): Path | Null = js.native
  def getModule(name: String, platform: String): Path | Null = js.native
  def getModule(name: String, platform: String, supportsNativePlatform: Boolean): Path | Null = js.native
  def getModule(name: String, platform: String, supportsNativePlatform: Boolean, `type`: HTypeValue): Path | Null = js.native
  def getModule(name: String, platform: String, supportsNativePlatform: Null, `type`: HTypeValue): Path | Null = js.native
  def getModule(name: String, platform: String, supportsNativePlatform: Unit, `type`: HTypeValue): Path | Null = js.native
  def getModule(name: String, platform: Null, supportsNativePlatform: Boolean): Path | Null = js.native
  def getModule(name: String, platform: Null, supportsNativePlatform: Boolean, `type`: HTypeValue): Path | Null = js.native
  def getModule(name: String, platform: Null, supportsNativePlatform: Null, `type`: HTypeValue): Path | Null = js.native
  def getModule(name: String, platform: Null, supportsNativePlatform: Unit, `type`: HTypeValue): Path | Null = js.native
  def getModule(name: String, platform: Unit, supportsNativePlatform: Boolean): Path | Null = js.native
  def getModule(name: String, platform: Unit, supportsNativePlatform: Boolean, `type`: HTypeValue): Path | Null = js.native
  def getModule(name: String, platform: Unit, supportsNativePlatform: Null, `type`: HTypeValue): Path | Null = js.native
  def getModule(name: String, platform: Unit, supportsNativePlatform: Unit, `type`: HTypeValue): Path | Null = js.native
  
  def getPackage(name: String): Path | Null = js.native
  def getPackage(name: String, platform: String): Path | Null = js.native
  def getPackage(name: String, platform: String, _supportsNativePlatform: Boolean): Path | Null = js.native
  def getPackage(name: String, platform: Null, _supportsNativePlatform: Boolean): Path | Null = js.native
  
  def getRawModuleMap(): ReadOnlyRawModuleMap = js.native
}
