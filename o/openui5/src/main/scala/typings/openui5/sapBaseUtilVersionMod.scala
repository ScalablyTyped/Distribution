package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseUtilVersionMod {
  
  @JSImport("sap/base/util/Version", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Version {
    def this(
      /**
      * the major part of the version (int) or any of the single parameter variants explained above.
      */
    vMajor: String,
      /**
      * the minor part of the version number
      */
    iMinor: int,
      /**
      * the patch part of the version number
      */
    iPatch: int,
      /**
      * the suffix part of the version number
      */
    sSuffix: String
    ) = this()
    def this(
      /**
      * the major part of the version (int) or any of the single parameter variants explained above.
      */
    vMajor: js.Array[Any],
      /**
      * the minor part of the version number
      */
    iMinor: int,
      /**
      * the patch part of the version number
      */
    iPatch: int,
      /**
      * the suffix part of the version number
      */
    sSuffix: String
    ) = this()
    /**
      * Returns a Version instance created from the given parameters.
      *
      * This function can either be called as a constructor (using `new`) or as a normal function. It always
      * returns an immutable Version instance.
      *
      * The parts of the version number (major, minor, patch, suffix) can be provided in several ways:
      * 	 - Version("1.2.3-SNAPSHOT") - as a dot-separated string. Any non-numerical char or a dot followed by
      * 			a non-numerical char starts the suffix portion. Any missing major, minor or patch versions will be set
      * 			to 0.
      * 	 - Version(1,2,3,"-SNAPSHOT") - as individual parameters. Major, minor and patch must be integer numbers
      * 			or empty, suffix must be a string not starting with digits.
      * 	 - Version([1,2,3,"-SNAPSHOT"]) - as an array with the individual parts. The same type restrictions
      * 			apply as before.
      * 	 - Version(otherVersion) - as a Version instance (cast operation). Returns the given instance instead
      * 			of creating a new one.
      *
      * To keep the code size small, this implementation mainly validates the single string variant. All other
      * variants are only validated to some degree. It is the responsibility of the caller to provide proper
      * parts.
      */
    def this(
      /**
      * the major part of the version (int) or any of the single parameter variants explained above.
      */
    vMajor: int,
      /**
      * the minor part of the version number
      */
    iMinor: int,
      /**
      * the patch part of the version number
      */
    iPatch: int,
      /**
      * the suffix part of the version number
      */
    sSuffix: String
    ) = this()
    def this(
      /**
      * the major part of the version (int) or any of the single parameter variants explained above.
      */
    vMajor: Version,
      /**
      * the minor part of the version number
      */
    iMinor: int,
      /**
      * the patch part of the version number
      */
    iPatch: int,
      /**
      * the suffix part of the version number
      */
    sSuffix: String
    ) = this()
  }
  
  @js.native
  trait Version extends StObject {
    
    /**
      * Compares this version with a given one.
      *
      * The version with which this version should be compared can be given as a `sap/base/util/Version` instance,
      * as a string (e.g. `v.compareto("1.4.5")`). Or major, minor, patch and suffix values can be given as separate
      * parameters (e.g. `v.compareTo(1, 4, 5)`) or in an array (e.g. `v.compareTo([1, 4, 5])`).
      *
      * @returns 0, if the given version is equal to this version, a negative value if the given other version
      * is greater and a positive value otherwise
      */
    def compareTo(): int = js.native
    
    /**
      * Returns the major version part of this version.
      *
      * @returns the major version part of this version
      */
    def getMajor(): int = js.native
    
    /**
      * Returns the minor version part of this version.
      *
      * @returns the minor version part of this version
      */
    def getMinor(): int = js.native
    
    /**
      * Returns the patch (or micro) version part of this version.
      *
      * @returns the patch version part of this version
      */
    def getPatch(): int = js.native
    
    /**
      * Returns the version suffix of this version.
      *
      * @returns the version suffix of this version
      */
    def getSuffix(): String = js.native
    
    /**
      * Checks whether this version is in the range of the given interval (start inclusive, end exclusive).
      *
      * The boundaries against which this version should be checked can be given as `sap/base/util/Version` instances
      * (e.g. `v.inRange(v1, v2)`), as strings (e.g. `v.inRange("1.4", "2.7")`) or as arrays (e.g. `v.inRange([1,4],
      * [2,7])`).
      *
      * @returns `true` if this version is greater or equal to `vMin` and smaller than `vMax`, `false` otherwise.
      */
    def inRange(
      /**
      * the start of the range (inclusive)
      */
    vMin: String,
      /**
      * the end of the range (exclusive)
      */
    vMax: String
    ): Boolean = js.native
    def inRange(
      /**
      * the start of the range (inclusive)
      */
    vMin: String,
      /**
      * the end of the range (exclusive)
      */
    vMax: js.Array[Any]
    ): Boolean = js.native
    def inRange(
      /**
      * the start of the range (inclusive)
      */
    vMin: String,
      /**
      * the end of the range (exclusive)
      */
    vMax: Version
    ): Boolean = js.native
    def inRange(
      /**
      * the start of the range (inclusive)
      */
    vMin: js.Array[Any],
      /**
      * the end of the range (exclusive)
      */
    vMax: String
    ): Boolean = js.native
    def inRange(
      /**
      * the start of the range (inclusive)
      */
    vMin: js.Array[Any],
      /**
      * the end of the range (exclusive)
      */
    vMax: js.Array[Any]
    ): Boolean = js.native
    def inRange(
      /**
      * the start of the range (inclusive)
      */
    vMin: js.Array[Any],
      /**
      * the end of the range (exclusive)
      */
    vMax: Version
    ): Boolean = js.native
    def inRange(
      /**
      * the start of the range (inclusive)
      */
    vMin: Version,
      /**
      * the end of the range (exclusive)
      */
    vMax: String
    ): Boolean = js.native
    def inRange(
      /**
      * the start of the range (inclusive)
      */
    vMin: Version,
      /**
      * the end of the range (exclusive)
      */
    vMax: js.Array[Any]
    ): Boolean = js.native
    def inRange(
      /**
      * the start of the range (inclusive)
      */
    vMin: Version,
      /**
      * the end of the range (exclusive)
      */
    vMax: Version
    ): Boolean = js.native
  }
}
