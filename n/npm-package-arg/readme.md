```
// Type definitions for npm-package-arg 6.1
// Project: https://github.com/npm/npm-package-arg
// Definitions by: Melvin Groenhoff <https://github.com/mgroenhoff>
//                 Jason <https://github.com/OiYouYeahYou>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.1
/**
 * Throws if the package name is invalid, a dist-tag is invalid or a URL's protocol is not supported.
 * @param arg a string that you might pass to npm install, like:
 * foo@1.2, @bar/foo@1.2, foo@user/foo, http://x.com/foo.tgz, git+https://github.com/user/foo, bitbucket:user/foo, foo.tar.gz, ../foo/bar/ or bar.
 * If the arg you provide doesn't have a specifier part, eg foo then the specifier will default to latest.
 * @param where Optionally the path to resolve file paths relative to. Defaults to process.cwd()
 */
```