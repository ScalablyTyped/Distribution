package typings.mockDashAwsDashS3.mockDashAwsDashS3Mod

import org.scalablytyped.runtime.TopLevel
import typings.awsDashSdk.libConfigMod.APIVersions
import typings.awsDashSdk.libConfigMod.ConfigurationOptions
import typings.awsDashSdk.libConfigMod.GlobalConfigInstance
import typings.awsDashSdk.libConfigUnderscoreServiceUnderscorePlaceholdersMod.ConfigurationServicePlaceholders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "Config")
@js.native
/**
  * Creates a new configuration object.
  * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
  */
class Config ()
  extends typings.awsDashSdk.awsDashSdkMod.Config {
  def this(options: ConfigurationOptions with ConfigurationServicePlaceholders with APIVersions) = this()
}

@JSImport("mock-aws-s3", "config")
@js.native
object config extends TopLevel[GlobalConfigInstance with MockConfigInstance]

