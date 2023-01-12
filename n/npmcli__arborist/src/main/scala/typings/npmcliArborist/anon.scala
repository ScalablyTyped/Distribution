package typings.npmcliArborist

import org.scalablytyped.runtime.StringDictionary
import typings.npmcliArborist.mod.Node
import typings.npmcliArborist.mod.SaveType
import typings.npmcliArborist.mod.VulnJson
import typings.npmcliArborist.npmcliArboristBooleans.`false`
import typings.npmcliArborist.npmcliArboristBooleans.`true`
import typings.npmcliArborist.npmcliArboristStrings.peerOptional
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait All extends StObject {
    
    var all: js.UndefOr[Boolean] = js.undefined
    
    var names: js.UndefOr[js.Array[String]] = js.undefined
  }
  object All {
    
    inline def apply(): All = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[All]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: All] (val x: Self) extends AnyVal {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    }
  }
  
  trait AuditReportVersion extends StObject {
    
    var auditReportVersion: Double
    
    var metadata: Dependencies
    
    var vulnerabilities: StringDictionary[VulnJson]
  }
  object AuditReportVersion {
    
    inline def apply(auditReportVersion: Double, metadata: Dependencies, vulnerabilities: StringDictionary[VulnJson]): AuditReportVersion = {
      val __obj = js.Dynamic.literal(auditReportVersion = auditReportVersion.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], vulnerabilities = vulnerabilities.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuditReportVersion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuditReportVersion] (val x: Self) extends AnyVal {
      
      inline def setAuditReportVersion(value: Double): Self = StObject.set(x, "auditReportVersion", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Dependencies): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setVulnerabilities(value: StringDictionary[VulnJson]): Self = StObject.set(x, "vulnerabilities", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @npmcli/arborist.@npmcli/arborist.BuildIdealTreeOptions & {  fix :boolean | undefined} */
  trait BuildIdealTreeOptionsfixb extends StObject {
    
    var add: js.UndefOr[js.Array[String]] = js.undefined
    
    var engineStrict: js.UndefOr[Boolean] = js.undefined
    
    var fix: js.UndefOr[Boolean] = js.undefined
    
    var legacyBundling: js.UndefOr[Boolean] = js.undefined
    
    var preferDedupe: js.UndefOr[Boolean] = js.undefined
    
    var prune: js.UndefOr[Boolean] = js.undefined
    
    var rm: js.UndefOr[js.Array[String]] = js.undefined
    
    var saveBundle: js.UndefOr[Boolean] = js.undefined
    
    var saveType: js.UndefOr[SaveType] = js.undefined
    
    var update: js.UndefOr[Boolean | All] = js.undefined
  }
  object BuildIdealTreeOptionsfixb {
    
    inline def apply(): BuildIdealTreeOptionsfixb = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildIdealTreeOptionsfixb]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildIdealTreeOptionsfixb] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: js.Array[String]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setAddVarargs(value: String*): Self = StObject.set(x, "add", js.Array(value*))
      
      inline def setEngineStrict(value: Boolean): Self = StObject.set(x, "engineStrict", value.asInstanceOf[js.Any])
      
      inline def setEngineStrictUndefined: Self = StObject.set(x, "engineStrict", js.undefined)
      
      inline def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
      
      inline def setLegacyBundling(value: Boolean): Self = StObject.set(x, "legacyBundling", value.asInstanceOf[js.Any])
      
      inline def setLegacyBundlingUndefined: Self = StObject.set(x, "legacyBundling", js.undefined)
      
      inline def setPreferDedupe(value: Boolean): Self = StObject.set(x, "preferDedupe", value.asInstanceOf[js.Any])
      
      inline def setPreferDedupeUndefined: Self = StObject.set(x, "preferDedupe", js.undefined)
      
      inline def setPrune(value: Boolean): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
      
      inline def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
      
      inline def setRm(value: js.Array[String]): Self = StObject.set(x, "rm", value.asInstanceOf[js.Any])
      
      inline def setRmUndefined: Self = StObject.set(x, "rm", js.undefined)
      
      inline def setRmVarargs(value: String*): Self = StObject.set(x, "rm", js.Array(value*))
      
      inline def setSaveBundle(value: Boolean): Self = StObject.set(x, "saveBundle", value.asInstanceOf[js.Any])
      
      inline def setSaveBundleUndefined: Self = StObject.set(x, "saveBundle", js.undefined)
      
      inline def setSaveType(value: SaveType): Self = StObject.set(x, "saveType", value.asInstanceOf[js.Any])
      
      inline def setSaveTypeUndefined: Self = StObject.set(x, "saveType", js.undefined)
      
      inline def setUpdate(value: Boolean | All): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  /* Inlined @npmcli/arborist.@npmcli/arborist.BuildIdealTreeOptions & {  fix :false | undefined} */
  trait BuildIdealTreeOptionsfixf extends StObject {
    
    var add: js.UndefOr[js.Array[String]] = js.undefined
    
    var engineStrict: js.UndefOr[Boolean] = js.undefined
    
    var fix: js.UndefOr[`false`] = js.undefined
    
    var legacyBundling: js.UndefOr[Boolean] = js.undefined
    
    var preferDedupe: js.UndefOr[Boolean] = js.undefined
    
    var prune: js.UndefOr[Boolean] = js.undefined
    
    var rm: js.UndefOr[js.Array[String]] = js.undefined
    
    var saveBundle: js.UndefOr[Boolean] = js.undefined
    
    var saveType: js.UndefOr[SaveType] = js.undefined
    
    var update: js.UndefOr[Boolean | All] = js.undefined
  }
  object BuildIdealTreeOptionsfixf {
    
    inline def apply(): BuildIdealTreeOptionsfixf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildIdealTreeOptionsfixf]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildIdealTreeOptionsfixf] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: js.Array[String]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setAddVarargs(value: String*): Self = StObject.set(x, "add", js.Array(value*))
      
      inline def setEngineStrict(value: Boolean): Self = StObject.set(x, "engineStrict", value.asInstanceOf[js.Any])
      
      inline def setEngineStrictUndefined: Self = StObject.set(x, "engineStrict", js.undefined)
      
      inline def setFix(value: `false`): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
      
      inline def setLegacyBundling(value: Boolean): Self = StObject.set(x, "legacyBundling", value.asInstanceOf[js.Any])
      
      inline def setLegacyBundlingUndefined: Self = StObject.set(x, "legacyBundling", js.undefined)
      
      inline def setPreferDedupe(value: Boolean): Self = StObject.set(x, "preferDedupe", value.asInstanceOf[js.Any])
      
      inline def setPreferDedupeUndefined: Self = StObject.set(x, "preferDedupe", js.undefined)
      
      inline def setPrune(value: Boolean): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
      
      inline def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
      
      inline def setRm(value: js.Array[String]): Self = StObject.set(x, "rm", value.asInstanceOf[js.Any])
      
      inline def setRmUndefined: Self = StObject.set(x, "rm", js.undefined)
      
      inline def setRmVarargs(value: String*): Self = StObject.set(x, "rm", js.Array(value*))
      
      inline def setSaveBundle(value: Boolean): Self = StObject.set(x, "saveBundle", value.asInstanceOf[js.Any])
      
      inline def setSaveBundleUndefined: Self = StObject.set(x, "saveBundle", js.undefined)
      
      inline def setSaveType(value: SaveType): Self = StObject.set(x, "saveType", value.asInstanceOf[js.Any])
      
      inline def setSaveTypeUndefined: Self = StObject.set(x, "saveType", js.undefined)
      
      inline def setUpdate(value: Boolean | All): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  /* Inlined @npmcli/arborist.@npmcli/arborist.BuildIdealTreeOptions & {  fix :true} */
  trait BuildIdealTreeOptionsfixt extends StObject {
    
    var add: js.UndefOr[js.Array[String]] = js.undefined
    
    var engineStrict: js.UndefOr[Boolean] = js.undefined
    
    var fix: `true`
    
    var legacyBundling: js.UndefOr[Boolean] = js.undefined
    
    var preferDedupe: js.UndefOr[Boolean] = js.undefined
    
    var prune: js.UndefOr[Boolean] = js.undefined
    
    var rm: js.UndefOr[js.Array[String]] = js.undefined
    
    var saveBundle: js.UndefOr[Boolean] = js.undefined
    
    var saveType: js.UndefOr[SaveType] = js.undefined
    
    var update: js.UndefOr[Boolean | All] = js.undefined
  }
  object BuildIdealTreeOptionsfixt {
    
    inline def apply(): BuildIdealTreeOptionsfixt = {
      val __obj = js.Dynamic.literal(fix = true)
      __obj.asInstanceOf[BuildIdealTreeOptionsfixt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildIdealTreeOptionsfixt] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: js.Array[String]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setAddVarargs(value: String*): Self = StObject.set(x, "add", js.Array(value*))
      
      inline def setEngineStrict(value: Boolean): Self = StObject.set(x, "engineStrict", value.asInstanceOf[js.Any])
      
      inline def setEngineStrictUndefined: Self = StObject.set(x, "engineStrict", js.undefined)
      
      inline def setFix(value: `true`): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      inline def setLegacyBundling(value: Boolean): Self = StObject.set(x, "legacyBundling", value.asInstanceOf[js.Any])
      
      inline def setLegacyBundlingUndefined: Self = StObject.set(x, "legacyBundling", js.undefined)
      
      inline def setPreferDedupe(value: Boolean): Self = StObject.set(x, "preferDedupe", value.asInstanceOf[js.Any])
      
      inline def setPreferDedupeUndefined: Self = StObject.set(x, "preferDedupe", js.undefined)
      
      inline def setPrune(value: Boolean): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
      
      inline def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
      
      inline def setRm(value: js.Array[String]): Self = StObject.set(x, "rm", value.asInstanceOf[js.Any])
      
      inline def setRmUndefined: Self = StObject.set(x, "rm", js.undefined)
      
      inline def setRmVarargs(value: String*): Self = StObject.set(x, "rm", js.Array(value*))
      
      inline def setSaveBundle(value: Boolean): Self = StObject.set(x, "saveBundle", value.asInstanceOf[js.Any])
      
      inline def setSaveBundleUndefined: Self = StObject.set(x, "saveBundle", js.undefined)
      
      inline def setSaveType(value: SaveType): Self = StObject.set(x, "saveType", value.asInstanceOf[js.Any])
      
      inline def setSaveTypeUndefined: Self = StObject.set(x, "saveType", js.undefined)
      
      inline def setUpdate(value: Boolean | All): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait Critical extends StObject {
    
    var critical: Double
    
    var high: Double
    
    var info: Double
    
    var low: Double
    
    var moderate: Double
    
    var total: Double
  }
  object Critical {
    
    inline def apply(critical: Double, high: Double, info: Double, low: Double, moderate: Double, total: Double): Critical = {
      val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], moderate = moderate.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Critical]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Critical] (val x: Self) extends AnyVal {
      
      inline def setCritical(value: Double): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: Double): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setModerate(value: Double): Self = StObject.set(x, "moderate", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dependencies extends StObject {
    
    var dependencies: Dev
    
    var vulnerabilities: Critical
  }
  object Dependencies {
    
    inline def apply(dependencies: Dev, vulnerabilities: Critical): Dependencies = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], vulnerabilities = vulnerabilities.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dependencies]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dependencies] (val x: Self) extends AnyVal {
      
      inline def setDependencies(value: Dev): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setVulnerabilities(value: Critical): Self = StObject.set(x, "vulnerabilities", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dev extends StObject {
    
    var dev: Double
    
    var optional: Double
    
    var peer: Double
    
    var peerOptional: Double
    
    var prod: Double
    
    var total: Double
  }
  object Dev {
    
    inline def apply(dev: Double, optional: Double, peer: Double, peerOptional: Double, prod: Double, total: Double): Dev = {
      val __obj = js.Dynamic.literal(dev = dev.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], peerOptional = peerOptional.asInstanceOf[js.Any], prod = prod.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dev]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dev] (val x: Self) extends AnyVal {
      
      inline def setDev(value: Double): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setOptional(value: Double): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setPeer(value: Double): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setPeerOptional(value: Double): Self = StObject.set(x, "peerOptional", value.asInstanceOf[js.Any])
      
      inline def setProd(value: Double): Self = StObject.set(x, "prod", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@npmcli/arborist.@npmcli/arborist.ReifyOptions, 'preferDedupe' | 'names'> */
  trait OmitReifyOptionspreferDed extends StObject {
    
    var add: js.UndefOr[js.Array[String]] = js.undefined
    
    var engineStrict: js.UndefOr[Boolean] = js.undefined
    
    var legacyBundling: js.UndefOr[Boolean] = js.undefined
    
    var omit: js.UndefOr[js.Array[SaveType]] = js.undefined
    
    var prune: js.UndefOr[Boolean] = js.undefined
    
    var rm: js.UndefOr[js.Array[String]] = js.undefined
    
    var save: js.UndefOr[Boolean] = js.undefined
    
    var saveBundle: js.UndefOr[Boolean] = js.undefined
    
    var saveType: js.UndefOr[SaveType] = js.undefined
    
    var update: js.UndefOr[Boolean | All] = js.undefined
  }
  object OmitReifyOptionspreferDed {
    
    inline def apply(): OmitReifyOptionspreferDed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitReifyOptionspreferDed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitReifyOptionspreferDed] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: js.Array[String]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setAddVarargs(value: String*): Self = StObject.set(x, "add", js.Array(value*))
      
      inline def setEngineStrict(value: Boolean): Self = StObject.set(x, "engineStrict", value.asInstanceOf[js.Any])
      
      inline def setEngineStrictUndefined: Self = StObject.set(x, "engineStrict", js.undefined)
      
      inline def setLegacyBundling(value: Boolean): Self = StObject.set(x, "legacyBundling", value.asInstanceOf[js.Any])
      
      inline def setLegacyBundlingUndefined: Self = StObject.set(x, "legacyBundling", js.undefined)
      
      inline def setOmit(value: js.Array[SaveType]): Self = StObject.set(x, "omit", value.asInstanceOf[js.Any])
      
      inline def setOmitUndefined: Self = StObject.set(x, "omit", js.undefined)
      
      inline def setOmitVarargs(value: SaveType*): Self = StObject.set(x, "omit", js.Array(value*))
      
      inline def setPrune(value: Boolean): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
      
      inline def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
      
      inline def setRm(value: js.Array[String]): Self = StObject.set(x, "rm", value.asInstanceOf[js.Any])
      
      inline def setRmUndefined: Self = StObject.set(x, "rm", js.undefined)
      
      inline def setRmVarargs(value: String*): Self = StObject.set(x, "rm", js.Array(value*))
      
      inline def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      inline def setSaveBundle(value: Boolean): Self = StObject.set(x, "saveBundle", value.asInstanceOf[js.Any])
      
      inline def setSaveBundleUndefined: Self = StObject.set(x, "saveBundle", js.undefined)
      
      inline def setSaveType(value: SaveType): Self = StObject.set(x, "saveType", value.asInstanceOf[js.Any])
      
      inline def setSaveTypeUndefined: Self = StObject.set(x, "saveType", js.undefined)
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setUpdate(value: Boolean | All): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@npmcli/arborist.@npmcli/arborist.Edge, 'from' | 'type' | 'name' | 'spec'> */
  trait PickEdgefromtypenamespec extends StObject {
    
    var from: Node
    
    var name: String
    
    var spec: String
    
    var `type`: Exclude[SaveType, peerOptional]
  }
  object PickEdgefromtypenamespec {
    
    inline def apply(from: Node, name: String, spec: String, `type`: Exclude[SaveType, peerOptional]): PickEdgefromtypenamespec = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickEdgefromtypenamespec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickEdgefromtypenamespec] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Node): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: String): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setType(value: Exclude[SaveType, peerOptional]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Workspaces extends StObject {
    
    var workspaces: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Workspaces {
    
    inline def apply(): Workspaces = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Workspaces]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Workspaces] (val x: Self) extends AnyVal {
      
      inline def setWorkspaces(value: js.Array[String]): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
      
      inline def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
      
      inline def setWorkspacesVarargs(value: String*): Self = StObject.set(x, "workspaces", js.Array(value*))
    }
  }
}
