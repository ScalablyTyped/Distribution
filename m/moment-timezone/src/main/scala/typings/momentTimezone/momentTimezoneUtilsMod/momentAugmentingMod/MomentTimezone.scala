package typings.momentTimezone.momentTimezoneUtilsMod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends MomentTimezone declared in index */
@js.native
trait MomentTimezone extends js.Object {
  
  /** Create links out of two zones that share data.
    * @returns A new ZoneBundle with duplicate zone data replaced by links
    */
  def createLinks(unlinked: UnpackedZoneBundle): PackedZoneBundle = js.native
  
  /**
    * Combines packing, link creation, and subsetting of years into one simple interface.
    * Pass in an unpacked bundle, start year, and end year and get a filtered, linked, packed bundle back.
    */
  def filterLinkPack(unpackedBundle: UnpackedZoneBundle, startAndEndYear: Double): PackedZoneBundle = js.native
  /**
    * Combines packing, link creation, and subsetting of years into one simple interface.
    * Pass in an unpacked bundle, start year, and end year and get a filtered, linked, packed bundle back.
    */
  def filterLinkPack(unpackedBundle: UnpackedZoneBundle, startYear: Double, endYear: Double): PackedZoneBundle = js.native
  
  /**
    * Filter out data for years outside a certain range.
    * @return a new, filtered UnPackedZone object
    */
  def filterYears(unpackedZone: UnpackedZone, startAndEndYear: Double): UnpackedZone = js.native
  /**
    * Filter out data for years outside a certain range.
    * @return a new, filtered UnPackedZone object
    */
  def filterYears(unpackedZone: UnpackedZone, startYear: Double, endYear: Double): UnpackedZone = js.native
  
  /** Converts zone data in the unpacked format to the packed format. */
  def pack(unpackedObject: UnpackedZone): String = js.native
  
  /** Convert a base 10 number to a base 60 string. */
  def packBase60(input: Double): String = js.native
  def packBase60(input: Double, precision: Double): String = js.native
}
